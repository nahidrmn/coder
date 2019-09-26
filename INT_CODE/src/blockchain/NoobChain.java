package blockchain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class NoobChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<>();
	public static int difficulty = 2;
	public static void main(String[] args) {
		/*Block genesisBlock = new Block("I'm the first block", "0");
		System.out.println("Hash for block 1: " + genesisBlock.hash);
		Block secondBlock = new Block("I'm the second block", genesisBlock.hash);
		System.out.println("Hash for block 1: " + secondBlock.hash);
		Block thirdBlock = new Block("I'm the third block", secondBlock.hash);
		System.out.println("Hash for block 1: " + thirdBlock.hash);*/
		
		/*blockchain.add(new Block("Hi Im first block", "0"));
		blockchain.add(new Block("Yo Im second block", blockchain.get(blockchain.size()-1).hash));
		blockchain.add(new Block("Hey Im third block", blockchain.get(blockchain.size()-1).hash));*/
		
		/*Mine Block*/
		blockchain.add(new Block("Hi Im first block", "0"));
		System.out.println("Trying to Mine block 1...");
		blockchain.get(0).mineBlock(difficulty);
		
		blockchain.add(new Block("Yo Im second block", blockchain.get(blockchain.size()-1).hash));
		System.out.println("Trying to Mine block 2...");
		blockchain.get(1).mineBlock(difficulty);
		
		blockchain.add(new Block("Hey Im third block", blockchain.get(blockchain.size()-1).hash));
		System.out.println("Trying to Mine block 3...");
		blockchain.get(2).mineBlock(difficulty);
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockchainJson);
		System.out.println(isChainValid());
	}
	
	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		for (int i = 1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			
			if(!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("Current hashes not equal");
				return false;
			}
			if(!previousBlock.hash.equals(currentBlock.previousHash)) {
				System.out.println("Previous hashes not equal");
				return false;
			}
			if(!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
				System.out.println("The block hasn't been mined");
				return false;
			}
		}
		return true;
	}
	
}