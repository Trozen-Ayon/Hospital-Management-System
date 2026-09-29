public class Launcher {
    public static void main(String[] args){
        javafx.application.Application.launch(Main.class, args);
    }
}

/*Option B: The "Professional" Method (Highly Recommended)

You create separate branches so you can both code
at the exact same time without interfering with each other.

1. When you want to work on a feature (e.g., a login page),
you create a branch in your IntelliJ terminal:bash

git checkout -b login-feature

2. You write your code, commit it, and push it to your branch:bash

git push origin login-feature

3. You go to GitHub, open a Pull Request,
and your friend reviews your code before merging it into the main branch.*/
