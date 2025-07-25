import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public App() {
        // Create a new frame for the application window
        frame = new JFrame("Login UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        // Add username label and text field to the frame
        JLabel usernameLabel = new JLabel("Username:");
        frame.getContentPane().add(usernameLabel);

        usernameField = new JTextField(20);
        frame.getContentPane().add(usernameField);

        // Add password label and password field to the frame
        JLabel passwordLabel = new JLabel("Password:");
        frame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField(20);
        frame.getContentPane().add(passwordField);

        // Add a login button with an action listener
        loginButton = new JButton("Login");
        loginButton.addActionListener(this::login);
        frame.getContentPane().add(loginButton);

        // Set the size of the frame and make it visible
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    // Method to handle the login button action
    private void login(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if entered credentials are correct
        if (username.equals("admin") && password.equals("password")) {
            frame.dispose(); // Close the login frame
            new HomePage(); // Open the home page
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password!");
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}

class HomePage extends JFrame {

    public HomePage() {
        super("Home Page");
        
        // Add a welcome message to the home page and center it
        JLabel welcomeLabel = new JLabel("Welcome to the Home Page!", SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.CENTER);
        
        // Set the size and properties of the home page window
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Add a logout button with an action listener
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> {
            dispose(); // Close the home page
            new App(); // Re-open the login screen
        });
        add(logoutButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}

