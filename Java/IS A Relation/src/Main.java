import com.xworkz.IsARelation.casting.BionicTest;
import com.xworkz.IsARelation.external.AdvancedBionicArm;
import com.xworkz.IsARelation.internal.BionicLimb;

public class Main {
    public static void main(String[] args) {
        BionicTest bionicTest = new BionicTest();

        System.out.println("**********************this is without Casting***************************");
        System.out.println("-----------passing instances of parent class with Parent references-------------------");
        BionicLimb bionicLimb = new BionicLimb();
        bionicTest.test(bionicLimb);
        System.out.println("-----------passing instances of Subclass class with Parent References-------------------");
        BionicLimb bionicLimb1 = new AdvancedBionicArm();
        bionicTest.test1(bionicLimb1);
        System.out.println("-----------passing instances of parent class with Sub class references-------------------");
        AdvancedBionicArm advancedBionicArm = new AdvancedBionicArm();
        bionicTest.test2(advancedBionicArm);


        System.out.println();
        System.out.println();
        System.out.println("*********************************WITH Casting ********************************");

        System.out.println("-----------passing instances of Subclass class with Parent References-------------------");
        BionicLimb bionicLimb2 = new AdvancedBionicArm();
        bionicTest.test3(bionicLimb2);


    }
}