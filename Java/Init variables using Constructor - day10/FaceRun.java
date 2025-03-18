class FaceRun{
	public static void main(String[] asd){
		String shape;
		int length;
		int width;
		
		shape = "triangle";
		length = 15;
		width = 10;
		Face face1 = new Face(shape,length,width);
		System.out.println("Face Shape : "+face1.shape+" length of the face : "+face1.length+"cm width of the Face : "+face1.width+"cm");
		
		shape = "round";
		length = 10;
		width = 10;
		Face face2 = new Face(shape,length,width);
		System.out.println("Face Shape : "+face2.shape+" length of the face : "+face2.length+"cm width of the Face : "+face2.width+"cm");
		
		
		shape = "box";
		length = 15;
		width = 15;
		Face face3 = new Face(shape,length,width);
		System.out.println("Face Shape : "+face3.shape+" length of the face : "+face3.length+"cm width of the Face : "+face3.width+"cm");
		
		
		shape = "squre";
		length = 20;
		width = 20;
		Face face4 = new Face(shape,length,width);
		System.out.println("Face Shape : "+face4.shape+" length of the face : "+face4.length+"cm width of the Face : "+face4.width+"cm");
		
		
		shape = "round";
		length = 15;
		width = 13;
		Face face5 = new Face(shape,length,width);
		System.out.println("Face Shape : "+face5.shape+" length of the face : "+face5.length+"cm width of the Face : "+face5.width+"cm");
		
	}
}