package OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit;
import java.io.IOException;

import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
public class LinkList{
	int index= 0;
	String key;
	public LinkNode first;
	public int sum_of_nude= 0;
	public LinkList(){}
	public boolean search(LinkNode linkNode, String key){
		if(null== linkNode){
			return false;
		}
		if(linkNode.name.equals(key)){
			return true;
		}
		while(null!= linkNode.next){
			linkNode= linkNode.next;
			if(linkNode.name.equals(key)){
				while(null!= linkNode.pre){
					linkNode=linkNode.pre;
				}
				return true;
			}
		}
		return false;
	}

	public LinkNode addNodeOnlyWithFace(LinkNode linkNode, NodeOSGI nOSGI) 
			throws CloneNotSupportedException, InstantiationException
			, IllegalAccessException, IOException {
		NodeOSGI currentOSGI= nOSGI;
		while(null!= currentOSGI && null!= currentOSGI.pre){
			currentOSGI= currentOSGI.pre;
		}
		if(null!= linkNode){			
			while(null!= currentOSGI){
				if(currentOSGI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals(linkNode.name)){
					linkNode.thisFace= currentOSGI.currentFace.AOP_MVE_CSI_DUQ();
					sum_of_nude++;
					index++;
					return linkNode;
				}
				currentOSGI= currentOSGI.next;
			}
		}	
		index++;
		sum_of_nude++;
		return linkNode;
	}

	public LinkNode addNode(LinkNode linkNode, String treeNodeName,int x,int y,NodeOSGI nOSGI ) 
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException
			, IOException {
		NodeOSGI currentOSGI= nOSGI;
		while(null!= currentOSGI && null!= currentOSGI.pre){
			currentOSGI= currentOSGI.pre;
		}
		if(null== linkNode){			
			while(null!= currentOSGI){
				if(currentOSGI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals(treeNodeName)){
					linkNode= new LinkNode();
					linkNode.addName(treeNodeName, x, y, ++index);
					linkNode.thisFace= currentOSGI.currentFace.AOP_MVE_CSI_DUQ();
					linkNode.next= null;
					linkNode.pre= null;
					sum_of_nude++;
					return linkNode;
				}
				currentOSGI= currentOSGI.next;
			}
		}
		while(null!= linkNode&& null!= linkNode.next){
			linkNode= linkNode.next;
		}
		while(null!= currentOSGI){
			if(currentOSGI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals(treeNodeName)){
				//linkNode=new linkNode();
				LinkNode node= new LinkNode();
				node.addName(treeNodeName, x, y, ++index);
				node.thisFace= currentOSGI.currentFace.AOP_MVE_CSI_DUQ();
				node.pre= linkNode;
				linkNode.next= node;
				sum_of_nude ++;
				return linkNode;
			}
			currentOSGI = currentOSGI.next;
		}
		while(null!= linkNode&& null!= linkNode.pre){
			linkNode = linkNode.pre;
		}
		sum_of_nude++;
		return linkNode;
	} 
	public LinkNode deletNode(LinkNode linkNode, String name, int ID, String primaryKey){
		if(null!= linkNode){
			if(linkNode.name.equals(name)&& linkNode.ID== ID
					&& linkNode.primaryKey.equalsIgnoreCase(primaryKey)){
				if(null!= linkNode.next){
					linkNode= linkNode.next;
					linkNode.pre= null;
					return linkNode;	
				}
				if(null== linkNode.next){
					linkNode= null;
					return linkNode;	
				}
			}
			while(null!= linkNode.next){
				linkNode = linkNode.next;
				if(linkNode.name.equals(name)&& linkNode.ID== ID
						&& linkNode.primaryKey.equalsIgnoreCase(primaryKey)){
					if(null!= linkNode.next){
						@SuppressWarnings("unused")
						LinkNode node= linkNode;
						linkNode= linkNode.next;
						linkNode.pre= linkNode.pre.pre;
						linkNode.pre.next= linkNode;
						node= null;
						linkNode= Sort.sort(linkNode);
						return linkNode;		
					}
					if(null== linkNode.next){
						linkNode= linkNode.pre;
						linkNode.next= null;
						linkNode= Sort.sort(linkNode);
						return linkNode;				
					}
				}
			}
		}
		return linkNode;	
	}
}