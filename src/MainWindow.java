
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
   static String signInState ="out"; 
   static String orderTypeChoose="delivery";
    static String[] buttonID= {"a1", "a2", "a3", "a4", "a5", "a6"};
    
    public MainWindow()
	{
         initComponents();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderType_buttonGroup = new javax.swing.ButtonGroup();
        category_jScrollPane = new javax.swing.JScrollPane();
        FoodCategory_jList = new javax.swing.JList();
        orderType_panel = new javax.swing.JPanel();
        Delivery_button = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        PickUp_button = new javax.swing.JRadioButton();
        title_Label = new javax.swing.JLabel();
        mainWindowFoodItem_jPanel = new javax.swing.JPanel();
        food1_jButton = new javax.swing.JButton();
        foodPrice1_jLabel = new javax.swing.JLabel();
        food2_jButton = new javax.swing.JButton();
        food3_jButton = new javax.swing.JButton();
        food4_jButton = new javax.swing.JButton();
        food5_jButton = new javax.swing.JButton();
        food6_jButton = new javax.swing.JButton();
        Category_jLabel = new javax.swing.JLabel();
        foodPrice1_jTextField = new javax.swing.JTextField();
        foodPrice2_jLabel = new javax.swing.JLabel();
        foodPrice2_jTextField = new javax.swing.JTextField();
        foodPrice3_jLabel = new javax.swing.JLabel();
        foodPrice3_jTextField = new javax.swing.JTextField();
        foodPrice4_jLabel = new javax.swing.JLabel();
        foodPrice4_jTextField = new javax.swing.JTextField();
        foodPrice5_jLabel = new javax.swing.JLabel();
        foodPrice5_jTextField = new javax.swing.JTextField();
        foodPrice6_jLabel = new javax.swing.JLabel();
        foodPrice6_jTextField = new javax.swing.JTextField();
        feelHungry_jButton = new javax.swing.JButton();
        exit_jButton = new javax.swing.JButton();
        controlButton_jPanel = new javax.swing.JPanel();
        SignIn_button = new javax.swing.JButton();
        MyOrderList_button = new javax.swing.JButton();
        MyAccount_button = new javax.swing.JButton();
        logo_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoodOrderSystem");
        setName(""); // NOI18N

        FoodCategory_jList.setBackground(new java.awt.Color(204, 204, 204));
        FoodCategory_jList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FoodCategory_jList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        FoodCategory_jList.setForeground(new java.awt.Color(255, 0, 0));
        FoodCategory_jList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Specials", "Appetizers", "Soup", "Salad", "Entrees", "Desserts", "Beverage" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        FoodCategory_jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FoodCategory_jList.setToolTipText("");
        FoodCategory_jList.setFixedCellHeight(40);
        FoodCategory_jList.setPreferredSize(new java.awt.Dimension(100, 240));
        FoodCategory_jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                FoodCategory_jListValueChanged(evt);
            }
        });
        category_jScrollPane.setViewportView(FoodCategory_jList);

        orderType_buttonGroup.add(Delivery_button);
        Delivery_button.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Delivery_button.setForeground(new java.awt.Color(0, 0, 255));
        Delivery_button.setSelected(true);
        Delivery_button.setText("Delivery");
        Delivery_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Choosing Order Type");

        orderType_buttonGroup.add(PickUp_button);
        PickUp_button.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PickUp_button.setForeground(new java.awt.Color(0, 0, 255));
        PickUp_button.setText("Pick up");
        PickUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickUp_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderType_panelLayout = new javax.swing.GroupLayout(orderType_panel);
        orderType_panel.setLayout(orderType_panelLayout);
        orderType_panelLayout.setHorizontalGroup(
            orderType_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderType_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderType_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderType_panelLayout.createSequentialGroup()
                        .addGroup(orderType_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PickUp_button)
                            .addComponent(Delivery_button))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderType_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        orderType_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Delivery_button, PickUp_button, jLabel1});

        orderType_panelLayout.setVerticalGroup(
            orderType_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderType_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PickUp_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delivery_button))
        );

        title_Label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        title_Label.setForeground(new java.awt.Color(255, 0, 0));
        title_Label.setText("Welcome  to  Food  Ordering  System  !");

        mainWindowFoodItem_jPanel.setName(""); // NOI18N

        food1_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food1_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/beef1.jpg"))); // NOI18N
        food1_jButton.setText("Beef With Cherry");
        food1_jButton.setToolTipText("Click to see");
        food1_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food1_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food1_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food1_jButtonActionPerformed(evt);
            }
        });

        foodPrice1_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice1_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice1_jLabel.setText("Price: ");

        food2_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food2_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/humburger1.jpg"))); // NOI18N
        food2_jButton.setText("Humburger");
        food2_jButton.setToolTipText("Click to see");
        food2_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food2_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food2_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food2_jButtonActionPerformed(evt);
            }
        });

        food3_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food3_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/pancake stackers1.jpg"))); // NOI18N
        food3_jButton.setText("Pancake Stackers");
        food3_jButton.setToolTipText("Click to see");
        food3_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food3_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food3_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food3_jButtonActionPerformed(evt);
            }
        });

        food4_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food4_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/Oil Pancake1.jpg"))); // NOI18N
        food4_jButton.setText("Oil Pancake");
        food4_jButton.setToolTipText("Click to see");
        food4_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food4_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food4_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food4_jButtonActionPerformed(evt);
            }
        });

        food5_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food5_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/pizza1.jpg"))); // NOI18N
        food5_jButton.setText("Barbecue Pizza");
        food5_jButton.setToolTipText("Click to see");
        food5_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food5_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food5_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food5_jButtonActionPerformed(evt);
            }
        });

        food6_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        food6_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TodaySpecial/taco1.jpg"))); // NOI18N
        food6_jButton.setText("Taco");
        food6_jButton.setToolTipText("Click to see");
        food6_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        food6_jButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        food6_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food6_jButtonActionPerformed(evt);
            }
        });

        Category_jLabel.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        Category_jLabel.setForeground(new java.awt.Color(255, 0, 0));
        Category_jLabel.setText("Today's Special:");

        foodPrice1_jTextField.setEditable(false);
        foodPrice1_jTextField.setText("Rs 16.50");

        foodPrice2_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice2_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice2_jLabel.setText("Price: ");

        foodPrice2_jTextField.setEditable(false);
        foodPrice2_jTextField.setText("Rs 102.50");

        foodPrice3_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice3_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice3_jLabel.setText("Price: ");

        foodPrice3_jTextField.setEditable(false);
        foodPrice3_jTextField.setText("Rs 17.00");

        foodPrice4_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice4_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice4_jLabel.setText("Price: ");

        foodPrice4_jTextField.setEditable(false);
        foodPrice4_jTextField.setText("Rs 94.50");

        foodPrice5_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice5_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice5_jLabel.setText("Price: ");

        foodPrice5_jTextField.setEditable(false);
        foodPrice5_jTextField.setText("Rs 76.50");

        foodPrice6_jLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        foodPrice6_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        foodPrice6_jLabel.setText("Price: ");

        foodPrice6_jTextField.setEditable(false);
        foodPrice6_jTextField.setText("Rs 95.00");

        feelHungry_jButton.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        feelHungry_jButton.setForeground(new java.awt.Color(204, 0, 204));
        feelHungry_jButton.setText("Feeling hungry");
        feelHungry_jButton.setEnabled(false);
        feelHungry_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feelHungry_jButtonActionPerformed(evt);
            }
        });

        exit_jButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit_jButton.setForeground(new java.awt.Color(0, 0, 255));
        exit_jButton.setText("Exit");
        exit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainWindowFoodItem_jPanelLayout = new javax.swing.GroupLayout(mainWindowFoodItem_jPanel);
        mainWindowFoodItem_jPanel.setLayout(mainWindowFoodItem_jPanelLayout);
        mainWindowFoodItem_jPanelLayout.setHorizontalGroup(
            mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(foodPrice1_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice1_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(foodPrice2_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice2_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodPrice3_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice3_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                        .addComponent(food4_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(food5_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(food6_jButton))
                    .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                        .addComponent(food1_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(food2_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(food3_jButton))
                    .addComponent(Category_jLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(foodPrice4_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice4_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(foodPrice5_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice5_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodPrice6_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodPrice6_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(feelHungry_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(exit_jButton)
                .addGap(25, 25, 25))
        );

        mainWindowFoodItem_jPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {food1_jButton, food2_jButton, food3_jButton, food4_jButton, food5_jButton, food6_jButton});

        mainWindowFoodItem_jPanelLayout.setVerticalGroup(
            mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWindowFoodItem_jPanelLayout.createSequentialGroup()
                .addComponent(Category_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(food2_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(food3_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(food1_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodPrice1_jLabel)
                    .addComponent(foodPrice1_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodPrice2_jLabel)
                    .addComponent(foodPrice2_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodPrice3_jLabel)
                    .addComponent(foodPrice3_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food4_jButton)
                    .addComponent(food5_jButton)
                    .addComponent(food6_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foodPrice6_jLabel)
                        .addComponent(foodPrice6_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foodPrice4_jLabel)
                        .addComponent(foodPrice4_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foodPrice5_jLabel)
                        .addComponent(foodPrice5_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(mainWindowFoodItem_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feelHungry_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainWindowFoodItem_jPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {food1_jButton, food2_jButton, food3_jButton, food4_jButton, food5_jButton, food6_jButton});

        mainWindowFoodItem_jPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exit_jButton, feelHungry_jButton});

        SignIn_button.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        SignIn_button.setForeground(new java.awt.Color(0, 0, 255));
        SignIn_button.setText("Sign In or Register");
        SignIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_buttonActionPerformed(evt);
            }
        });

        MyOrderList_button.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MyOrderList_button.setForeground(new java.awt.Color(0, 0, 255));
        MyOrderList_button.setText("My Order List");
        MyOrderList_button.setEnabled(false);
        MyOrderList_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyOrderList_buttonActionPerformed(evt);
            }
        });

        MyAccount_button.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MyAccount_button.setForeground(new java.awt.Color(0, 0, 255));
        MyAccount_button.setText("My Account");
        MyAccount_button.setEnabled(false);
        MyAccount_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlButton_jPanelLayout = new javax.swing.GroupLayout(controlButton_jPanel);
        controlButton_jPanel.setLayout(controlButton_jPanelLayout);
        controlButton_jPanelLayout.setHorizontalGroup(
            controlButton_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButton_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignIn_button)
                .addGap(18, 18, 18)
                .addComponent(MyOrderList_button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MyAccount_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlButton_jPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MyAccount_button, MyOrderList_button, SignIn_button});

        controlButton_jPanelLayout.setVerticalGroup(
            controlButton_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlButton_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlButton_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MyOrderList_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyAccount_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        controlButton_jPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MyAccount_button, MyOrderList_button, SignIn_button});

        logo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star8.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderType_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(logo_jLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(category_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(mainWindowFoodItem_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(controlButton_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlButton_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainWindowFoodItem_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(logo_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderType_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(category_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PickUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickUp_buttonActionPerformed
            orderTypeChoose ="pickup";
    }//GEN-LAST:event_PickUp_buttonActionPerformed

    private void SignIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_buttonActionPerformed
         SignInJDialog dialog = new SignInJDialog(new javax.swing.JFrame(), true);
        dialog.createSignInDialog();
    }//GEN-LAST:event_SignIn_buttonActionPerformed

    private void MyOrderList_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyOrderList_buttonActionPerformed
         new SummaryJDialog(new javax.swing.JFrame(), true).createSummaryJDialog();
    }//GEN-LAST:event_MyOrderList_buttonActionPerformed

    private void food2_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food2_jButtonActionPerformed
       if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[1]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
    }//GEN-LAST:event_food2_jButtonActionPerformed
      else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }
    private void food3_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food3_jButtonActionPerformed
          if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[2]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
          }
           else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_food3_jButtonActionPerformed
    private void food4_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food4_jButtonActionPerformed
           if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[3]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
         }
        else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_food4_jButtonActionPerformed
    private void food1_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food1_jButtonActionPerformed
         if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[0]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
         }
       else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_food1_jButtonActionPerformed
    private void food5_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food5_jButtonActionPerformed
         if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[4]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
         }
       else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_food5_jButtonActionPerformed
    private void food6_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food6_jButtonActionPerformed
         if(signInState.equals("in")){ 
        FoodItemJDialog dialog = new FoodItemJDialog(new javax.swing.JFrame(), true);
        ReadXMLDataBase data =new ReadXMLDataBase();
        data.readData(buttonID[5]);
        dialog.course_jTextField.setText(data.FoodName);
        dialog.price_jTextField.setText(" $"+data.FoodPrice);
        dialog.foodPic_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.Iamge2Url)));
        dialog.food_jTextArea.setText(data.FoodDescrip);
        dialog.createFoodItemDialog();
         }
       else if(signInState.equals("out")){
           JOptionPane.showMessageDialog(rootPane,
                      "Dear customer, please Sign In first", "Error Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_food6_jButtonActionPerformed
    private void FoodCategory_jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_FoodCategory_jListValueChanged
        if (evt.getValueIsAdjusting() == false) {  
	            if (FoodCategory_jList.getSelectedIndex() == -1) {
	            //No selection, 
	            
	            } else {
	            //Selection
	       
	            	// change content of foodItem Jpanel
	       String temp = FoodCategory_jList.getModel().getElementAt(FoodCategory_jList.getSelectedIndex()).toString();
	      new ReadXMLDataBase().readData(temp);
               
                   mainWindowFoodItem_jPanel.revalidate();
                    mainWindowFoodItem_jPanel.repaint();
	            }
	        }
    }//GEN-LAST:event_FoodCategory_jListValueChanged

    private void Delivery_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_buttonActionPerformed
        orderTypeChoose ="delivery";
    }//GEN-LAST:event_Delivery_buttonActionPerformed

    private void MyAccount_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_buttonActionPerformed
        UserAccount Udialog = new UserAccount(new javax.swing.JFrame(), true);
        Udialog.createUserAccountDialog();
    }//GEN-LAST:event_MyAccount_buttonActionPerformed

    private void exit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_jButtonActionPerformed

    private void feelHungry_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feelHungry_jButtonActionPerformed
       LazyMode dialog = new LazyMode(new javax.swing.JFrame(), true);
       dialog.createLazyModeDialog();
    }//GEN-LAST:event_feelHungry_jButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            MainWindow window  =new MainWindow();
             window.pack();
             window.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Category_jLabel;
    public javax.swing.JRadioButton Delivery_button;
    public javax.swing.JList FoodCategory_jList;
    public static javax.swing.JButton MyAccount_button;
    public static javax.swing.JButton MyOrderList_button;
    private javax.swing.JRadioButton PickUp_button;
    public static javax.swing.JButton SignIn_button;
    private javax.swing.JScrollPane category_jScrollPane;
    private javax.swing.JPanel controlButton_jPanel;
    private javax.swing.JButton exit_jButton;
    public static javax.swing.JButton feelHungry_jButton;
    public static javax.swing.JButton food1_jButton;
    public static javax.swing.JButton food2_jButton;
    public static javax.swing.JButton food3_jButton;
    public static javax.swing.JButton food4_jButton;
    public static javax.swing.JButton food5_jButton;
    public static javax.swing.JButton food6_jButton;
    private javax.swing.JLabel foodPrice1_jLabel;
    public static javax.swing.JTextField foodPrice1_jTextField;
    private javax.swing.JLabel foodPrice2_jLabel;
    public static javax.swing.JTextField foodPrice2_jTextField;
    private javax.swing.JLabel foodPrice3_jLabel;
    public static javax.swing.JTextField foodPrice3_jTextField;
    private javax.swing.JLabel foodPrice4_jLabel;
    public static javax.swing.JTextField foodPrice4_jTextField;
    private javax.swing.JLabel foodPrice5_jLabel;
    public static javax.swing.JTextField foodPrice5_jTextField;
    private javax.swing.JLabel foodPrice6_jLabel;
    public static javax.swing.JTextField foodPrice6_jTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo_jLabel;
    private javax.swing.JPanel mainWindowFoodItem_jPanel;
    public javax.swing.ButtonGroup orderType_buttonGroup;
    private javax.swing.JPanel orderType_panel;
    private javax.swing.JLabel title_Label;
    // End of variables declaration//GEN-END:variables
}
