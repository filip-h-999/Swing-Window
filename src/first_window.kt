import java.awt.Dimension
import javax.swing.*
import kotlin.system.exitProcess


object Window {
    @JvmStatic
    fun main(args: Array<String>) {
        val frame = JFrame("Fremdsprachen")
        val content = frame.contentPane
        val layout = SpringLayout()
        content.layout = layout

        frame.isVisible = true
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 300)
        frame.setLocation(430, 100)

        val panel = JPanel()
        panel.layout = BoxLayout(panel, BoxLayout.Y_AXIS)
        frame.add(panel)

        val lbl = JLabel("Wähle dein Fremdsprachen:")
        layout.putConstraint(SpringLayout.WEST , lbl,5,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , lbl,1,SpringLayout.NORTH, content)
        content.add(lbl)

        val lbl2 = JLabel("Klasse:")
        layout.putConstraint(SpringLayout.WEST , lbl2,200,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , lbl2,1,SpringLayout.NORTH, content)
        content.add(lbl2)

        val lbl3 = JLabel("Wahlpflicht:")
        layout.putConstraint(SpringLayout.WEST , lbl3,100,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , lbl3,160,SpringLayout.NORTH, content)
        content.add(lbl3)

        val choices = arrayOf(
            "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4",
            "CHOICE 5", "CHOICE 6")

        val value: SpinnerModel = SpinnerNumberModel(
            0,
            0,
            10,
            1)
        val s = JSpinner(value)
        content.add(s)
        layout.putConstraint(SpringLayout.WEST , s,200,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , s,27,SpringLayout.NORTH, content)

        val value2: SpinnerModel = SpinnerNumberModel(
            0,
            0,
            10,
            1)
        val s2 = JSpinner(value2)
        content.add(s2)
        layout.putConstraint(SpringLayout.WEST , s2,200,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , s2,58,SpringLayout.NORTH, content)

        val value3: SpinnerModel = SpinnerNumberModel(
            0,
            0,
            10,
            1)
        val s3 = JSpinner(value3)
        content.add(s3)
        layout.putConstraint(SpringLayout.WEST , s3,200,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , s3,88,SpringLayout.NORTH, content)

        val value4: SpinnerModel = SpinnerNumberModel(
            0,
            0,
            10,
            1)
        val s4 = JSpinner(value4)
        content.add(s4)
        layout.putConstraint(SpringLayout.WEST , s4,200,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , s4,119,SpringLayout.NORTH, content)

        val cb = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb,30,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb,25,SpringLayout.NORTH, content)
        content.add(cb)

        val cb2 = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb2,30,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb2,55,SpringLayout.NORTH, content)
        content.add(cb2)

        val cb3 = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb3,30,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb3,85,SpringLayout.NORTH, content)
        content.add(cb3)

        val cb4 = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb4,30,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb4,115,SpringLayout.NORTH, content)
        content.add(cb4)

        val cb5 = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb5,100,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb5,180,SpringLayout.NORTH, content)
        content.add(cb5)

        val cb6 = JComboBox(choices)
        layout.putConstraint(SpringLayout.WEST , cb6,100,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , cb6,210,SpringLayout.NORTH, content)
        cb6.isVisible = false
        content.add(cb6)

        val btn = JButton("Next")
        content.add(btn)
        layout.putConstraint(SpringLayout.WEST , btn,220,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , btn,220,SpringLayout.NORTH, content)
        btn.addActionListener { exitProcess(0) }

        val btn2 = JButton("")
        content.add(btn2)
        btn2.preferredSize = Dimension(25, 25)
        layout.putConstraint(SpringLayout.WEST , btn2,50,SpringLayout.WEST, content)
        layout.putConstraint(SpringLayout.NORTH , btn2,212,SpringLayout.NORTH, content)
        btn2.addActionListener { cb6.isVisible = true }

        frame.isVisible = true

    }
}