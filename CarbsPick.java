import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarbsPick extends JFrame implements ActionListener{
    
    String[] carbTypes={"Select","Potatoes","Rice","Bread(White)","Bread(Wholemeal)","Bread(Rye)"};
    JComboBox typeOfCarb=new JComboBox(carbTypes);
    JLabel per100Grams=new JLabel();
    JLabel carbStats=new JLabel();
    JLabel yourChoice=new JLabel();
    JButton confirm=new JButton("Confirm");
    JLabel chart=new JLabel();
    ImageIcon carb1=new ImageIcon("Carb1.png");
    ImageIcon carb2=new ImageIcon("Carb2.png");
    ImageIcon carb3=new ImageIcon("Carb3.png");
    ImageIcon carb4=new ImageIcon("Carb4.png");
    ImageIcon carb5=new ImageIcon("Carb5.png");
    JLabel recServing=new JLabel();

    CarbsPick(){

        this.setSize(550,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        typeOfCarb.setSize(200,25);
        typeOfCarb.setLocation(20, 50);
        typeOfCarb.setSelectedIndex(0);
        typeOfCarb.addActionListener(this);

        per100Grams.setSize(150,150);
        per100Grams.setLocation(10,150);
        per100Grams.setFont(new Font("Tahoma",Font.BOLD,12));

        carbStats.setSize(150, 150);
        carbStats.setLocation(10,300);
        carbStats.setFont(new Font("Tahoma",Font.BOLD,12));

        yourChoice.setSize(250, 150);
        yourChoice.setLocation(10,365);
        yourChoice.setFont(new Font("Tahoma",Font.BOLD,12));

        chart.setSize(300,150);
        chart.setLocation(200,100);
        chart.setVisible(true);

        recServing.setSize(300,25);
        recServing.setLocation(200, 300);
        recServing.setFont(new Font("Tahoma",Font.BOLD,12));

        confirm.setSize(100, 25);
        confirm.setLocation(70,20);
        confirm.setFont(new Font("Tahoma",Font.BOLD,12));
        confirm.addActionListener(this);
        confirm.setFocusable(false);
        
        this.add(typeOfCarb);
        this.add(confirm);
        this.add(per100Grams);
        this.add(yourChoice);
        this.add(carbStats);
        this.add(recServing);
        this.add(chart);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource()==confirm){
            FoodCategoryPick FCP=new FoodCategoryPick();
        }

       JComboBox cb=(JComboBox)e.getSource();

       String carbType=(String)cb.getSelectedItem();

       switch(carbType){
        
        case "Potatoes":
        per100Grams.setText("<html>Per 100g:<br>Calories: 93<br>Fats: 0.1g<br>Cholesterol: 0mg<br>Sodium: 10mg<br>Potassium: 535mg<br>Carbs: 21g<br>Fiber: 2.2g<br>Sugars: 1.2g<br>Protein: 2.5g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 1.1%<br>Vitamin A: 0%<br>Vitamin C: 0%<br>Calcium: 0.8%</html>");
        yourChoice.setText("You chose: Potatoes");
        recServing.setText("Recommended serving: 1 cup mashed or 1 medium");
        chart.setIcon(carb1);
        break;

        case "Rice":
        per100Grams.setText("<html>Per 100g:<br>Calories: 130<br>Fats: 0.3g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 35mg<br>Carbs: 28g<br>Fiber: 0.4g<br>Sugars: 0.1g<br>Protein: 2.7g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 6%<br>Vitamin A: 0.2%<br>Vitamin C: 16%<br>Calcium: 1.2%</html>");
        yourChoice.setText("You chose: Rice");
        recServing.setText("Recommended serving: 2 heaped tablespoons");
        chart.setIcon(carb2);
        break;

        case "Bread(White)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 266<br>Fats: 3.3g<br>Cholesterol: 0mg<br>Sodium: 490mg<br>Potassium: 126mg<br>Carbs: 49g<br>Fiber: 2.7g<br>Sugars: 5.7g<br>Protein: 8.9g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 20%<br>Vitamin A: 0%<br>Vitamin C: 0%<br>Calcium: 11%</html>");
        yourChoice.setText("You chose: Bread(White)");
        recServing.setText("<html>Recommended serving: 2 medium slices<br>only eat bread that is the right kind for you </html>");
        chart.setIcon(carb3);
        break;

        case "Bread(Wholemeal)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 252<br>Fats: 3.5g<br>Cholesterol: 0mg<br>Sodium: 455mg<br>Potassium: 254mg<br>Carbs: 43g<br>Fiber: 6g<br>Sugars: 4.3g<br>Protein: 12g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 14%<br>Vitamin A: 0.1%<br>Vitamin C: 0%<br>Calcium: 12%</html>");
        yourChoice.setText("You chose: Bread(Wholemeal)");
        recServing.setText("<html>Recommended serving: 2 medium slices<br>only eat bread that is the right kind for you </html>");
        chart.setIcon(carb4);
        break;

        case "Bread(Rye)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 259<br>Fats: 3.3g<br>Cholesterol: 0mg<br>Sodium: 603mg<br>Potassium: 166mg<br>Carbs: 48g<br>Fiber: 5.8g<br>Sugars: 3.9g<br>Protein: 8.5g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 16%<br>Vitamin A: 0.1%<br>Vitamin C: 0.7%<br>Calcium: 5.6%</html>");
        yourChoice.setText("You chose: Bread(Rye)");
        recServing.setText("<html>Recommended serving: 2 medium slices<br>only eat bread that is the right kind for you </html>");
        chart.setIcon(carb5);
        break;

       }
      
    }
}

