

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("animals","Grand",15,true);
        Zoo myZoo = new Zoo("Belvidère", "Tunis", 25);

        myZoo.animals = new Animal[]{lion};

        System.out.println("Informations sur l'animal :");
        System.out.println("Famille : " + lion.family);
        System.out.println("Nom : " + lion.name);
        System.out.println("Âge : " + lion.age + " ans");
        System.out.println("Est un mammifère : " + lion.isMammal);

        System.out.println("\nInformations sur le zoo :");
        System.out.println("Nom du zoo : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Nombre de cages : " + myZoo.nbrCages);
        System.out.println("Animaux dans le zoo : " + myZoo.animals.length);

    }
}
