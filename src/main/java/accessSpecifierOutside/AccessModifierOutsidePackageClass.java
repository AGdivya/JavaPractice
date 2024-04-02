package accessSpecifierOutside;

import accessSpecifier.AccessModifier;

public class AccessModifierOutsidePackageClass {

    public static void main(String[] args)
    {
        AccessModifier am = new AccessModifier();
        //am.clgName;           //  private variable not accessible outside package
       // am.disply();          // default modifier are also not accessible outside package
        am.show();              // public modifier are accessible outside package also

    }
}
