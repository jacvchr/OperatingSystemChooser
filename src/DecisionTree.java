/**
 * A Decision Tree used in the UserClient class
 * @author Jacob Christoffers
 */
import java.io.IOException;
import java.util.Scanner;

/**
 * A Decision Tree used in the UserClient class
 * @author JacobChristoffers
 */
public class DecisionTree 
{
    //-------------------------------Nested Class-------------------------------//
    private class BinTree
    {
        //instance variables
        private int nodeID;
        private String QuestionOrAnswer;
        private BinTree yesBranch = null;
        private BinTree noBranch = null;
        
        //constructor
        public BinTree(int newNodeID, String newAnswer)
        {
           nodeID = newNodeID;
           QuestionOrAnswer = newAnswer;
        }
    }
    //-----------------------------End Nested Class-----------------------------//
    
    //instance variables
    Scanner scan = new Scanner(System.in);
    BinTree rootNode = null;
    
    //constructor
    /**
     * constructor
     */
    public DecisionTree() {}
    
    //------------------------------------------------------Tree Building Methods------------------------------------------------------//
    /* Creating Root Node */
    /**
     * Creates a root node
     * @param newNodeID new node's ID
     * @param newQuestionOrAnswer new String
     */

    public void createRoot(int newNodeID, String newQuestionOrAnswer)
    {
        rootNode = new BinTree(newNodeID, newQuestionOrAnswer);
    }
    
    /* Adding a Yes Node */
    /**
     * Adding a yes node
     * @param existingNodeID the existing node's ID
     * @param newNodeID new node's ID
     * @param newQuestionOrAnswer new String
     */

    public void addYesNode(int existingNodeID, int newNodeID, String newQuestionOrAnswer)
    {
        //if no root node, do nothing
        if(rootNode == null)
        {
            System.out.println("Error: No Root Node");
            return;
        }
        //search tree
        if(searchTreeAndAddYesNode(rootNode, existingNodeID, newNodeID, newQuestionOrAnswer))
        {
            return;
        }
        else
        {
            System.out.println("Error: Node" +existingNodeID +" Not Found");
        }
    }
    
    /* Searching Tree and Adding the Yes Node */
    private boolean searchTreeAndAddYesNode(BinTree currentNode, int existingNodeID, int newNodeID, String newQuestionOrAnswer)
    {
        if(currentNode.nodeID == existingNodeID)
        {
            //if there is no yes branch
            if(currentNode.yesBranch == null)
            {
                currentNode.yesBranch = new BinTree(newNodeID, newQuestionOrAnswer);
            }
            else
            {
                System.out.println("Warning: Overwriting Previous Node (" +currentNode.yesBranch.nodeID 
                        +" which is linked to yes branch of node " +existingNodeID +")");
            }
            return true;
        }
        else
        {
            //see if yes branch exists
            if(currentNode.yesBranch != null)
            {
                if(searchTreeAndAddYesNode(currentNode.yesBranch, existingNodeID, newNodeID, newQuestionOrAnswer))
                {
                    return true;
                }
                else
                {
                    //see if no branch exists
                    if(currentNode.noBranch != null)
                    {
                        return(searchTreeAndAddYesNode(currentNode.noBranch, existingNodeID, newNodeID, newQuestionOrAnswer));
                    }
                    else
                    {
                        return false;       //not found
                    }
                }
            }
            return false;       //not found
        }
    }
    
    /* Adding a No Node */

    /**
     * Adding a no node
     * @param existingNodeID the existing node's ID
     * @param newNodeID new node's ID
     * @param newQuestionOrAnswer new String
     */

    public void addNoNode(int existingNodeID, int newNodeID, String newQuestionOrAnswer)
    {
        //if no root node, do nothing
        if(rootNode == null)
        {
            System.out.println("Error: No Root Node");
            return;
        }
        //search tree
        if(searchTreeAndAddNoNode(rootNode, existingNodeID, newNodeID, newQuestionOrAnswer))
        {
            return;
        }
        else
        {
            System.out.println("Error: Node" +existingNodeID +" Not Found");
        }
    }
    
    /* Searching Tree and Adding the Yes Node */
    private boolean searchTreeAndAddNoNode(BinTree currentNode, int existingNodeID, int newNodeID, String newQuestionOrAnswer)
    {
        if(currentNode.nodeID == existingNodeID)
        {
            //found node
            if(currentNode.noBranch == null)
            {
                currentNode.noBranch = new BinTree(newNodeID, newQuestionOrAnswer);
            }
            else
            {
                System.out.println("Warning: Overwriting Previous Node (" +currentNode.noBranch.nodeID 
                        +" which is linked to yes branch of node " +existingNodeID +")");
                currentNode.noBranch = new BinTree(newNodeID, newQuestionOrAnswer);
            }
            return true;
        }
        else
        {
            //see if yes branch exists
            if(currentNode.yesBranch != null)
            {
                if(searchTreeAndAddNoNode(currentNode.yesBranch, existingNodeID, newNodeID, newQuestionOrAnswer))
                {
                    return true;
                }
                else
                {
                    //see if no branch exists
                    if(currentNode.noBranch != null)
                    {
                        return(searchTreeAndAddNoNode(currentNode.noBranch, existingNodeID, newNodeID, newQuestionOrAnswer));
                    }
                    else
                    {
                        return false;       //not found
                    }
                }
            }
            return false;       //not found
        }
    }
    
    //------------------------------------------------------Tree Query Methods------------------------------------------------------//
    //default constructor
    /**
     * default constructor
     * @throws IOException wrong input
     */
    public void queryBinTree() throws IOException
    {
        queryBinTree(rootNode);
    }
    
    //constructor
    private void queryBinTree(BinTree currentNode) throws IOException
    {
        //test for leaf node (an answer) and missing branches
        if(currentNode.yesBranch == null)
        {
            if(currentNode.noBranch == null)
            {
                System.out.println(currentNode.QuestionOrAnswer);
            }
            else
            {
                System.out.println("Error: Missing\"Yes\" branch at \"" +currentNode.QuestionOrAnswer + "\" question");
            }
            return;
        }
        if(currentNode.noBranch == null)
        {
            System.out.println("Error: Missing\"No\" branch at \"" +currentNode.QuestionOrAnswer + "\" question");
            return;
        }
        //asking question
        askQuestion(currentNode);
    }
    
    /* Ask Question */
    private void askQuestion(BinTree currentNode) throws IOException
    {
        System.out.println(currentNode.QuestionOrAnswer +" (Enter \"Yes\" or \"No\")");
        String answer = scan.nextLine();
        if(answer.equals("Yes"))
        {
            queryBinTree(currentNode.yesBranch);
        }
        else
        {
            if(answer.equals("No"))
            {
                queryBinTree(currentNode.noBranch);
            }
            else
            {
                System.out.println("Error: Must Answer \"Yes\" or \"No\"");
                askQuestion(currentNode);
            }
        }
    }
}
