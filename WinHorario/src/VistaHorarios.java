import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author monkey
 */
public final class VistaHorarios extends javax.swing.JFrame {
    
    static ArrayList <Horario> soluciones;
    static ArrayList<Asignatura> asignaturas;
    static List<String[]> listaTurnos;
    static Component anterior;
    
    DefaultTableModel tablaHorario;  
    DefaultTableModel tablaAsigs;  
    
    public VistaHorarios(ArrayList <Horario> s,ArrayList<Asignatura> a, Component ant) 
    {
        soluciones=s;
        asignaturas=a;
        anterior=ant;
        
        //Carga los elementos del ComboBox de la tabla de asignaturas
        cargaListaTurnos();
        
        //Inicia vista
        initComponents();
        jLabel1.setText("Generados "+s.size()+" horarios");
        tablaHorario = (DefaultTableModel) jTable1.getModel();
        tablaAsigs = (DefaultTableModel) jTable2.getModel();
        
        //Carga tabla de asignaturas
        actualizaTablaAsigs();
        
        //Centra la ventana
        setLocationRelativeTo(null);
        
        //Dibuja el primer horario (soluciones.size > 0 al invocar)
        Dibuja(soluciones.get(0));  
    }
    
    private void cargaListaTurnos(){
        
        listaTurnos = new ArrayList<String[]>();
        
        String[] turnosAux;
        
        for (int i=0; i < asignaturas.size(); i++)
        {
            turnosAux = new String[asignaturas.get(i).clases.size()];
            
            for (int j=0; j < asignaturas.get(i).clases.size(); j++)
            {
                turnosAux[j]= asignaturas.get(i).clases.get(j).toString();
            }
            
            listaTurnos.add(turnosAux);
        }
                
    }
    
    private void actualizaTablaAsigs()
    {
        Object nuevo[];
         for (int i=0; i < asignaturas.size(); i++)
         {
             nuevo = new Object[] {asignaturas.get(i).nombre,""};
             tablaAsigs.addRow(nuevo);
         }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("monkey! Generador de horarios");
        setIconImage(new ImageIcon("monkey.png").getImage());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:00", null, null, null, null, null, null, null},
                {"08:30", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"09:30", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"10:30", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"11:30", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"12:30", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"13:30", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"14:30", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"15:30", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"16:30", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null},
                {"17:30", null, null, null, null, null, null, null},
                {"18:00", null, null, null, null, null, null, null},
                {"18:30", null, null, null, null, null, null, null},
                {"19:00", null, null, null, null, null, null, null},
                {"19:30", null, null, null, null, null, null, null},
                {"20:00", null, null, null, null, null, null, null},
                {"20:30", null, null, null, null, null, null, null},
                {"21:00", null, null, null, null, null, null, null},
                {"21:30", null, null, null, null, null, null, null},
                {"22:00", null, null, null, null, null, null, null},
                {"22:30", null, null, null, null, null, null, null},
                {"23:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setResizable(false);

        jLabel1.setText("\"Generados \"+s.size()+\" horarios\"");

        jLabel2.setText("Mostrar horario:");

        jTextField2.setText("1");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exportar este horario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportar(evt);
            }
        });

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVolver(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asignatura", "Turnos"
            }
        ));
        jTable2.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(1).setCellEditor(new MyComboEditor(listaTurnos));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(3, 3, 3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        actualizaHorario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
       
        actualizaHorario();
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
//            actualizaHorario();
//        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int seleccion = Integer.parseInt(jTextField2.getText())-1;
        
        if (seleccion > 0){
            String a="";
            a+=seleccion;
            jTextField2.setText(a);
            actualizaHorario();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int seleccion = Integer.parseInt(jTextField2.getText());
        
        if (seleccion < soluciones.size()){
            seleccion++;
            String a="";
            a+=seleccion;
            jTextField2.setText(a);
            actualizaHorario();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
String ExportDia(int d){
        String res;
        switch (d)
        {
                case 1: res="MO"; break;
                case 2: res="TU"; break;
                case 3: res="WE"; break;
                case 4: res="TH"; break;
                case 5: res="FR"; break;
                case 6: res="SA"; break;
               default: res="SU"; break;
        }
        
        return res;
    }
    
    String ExportHora(int h){
        String res; 
        switch (h)
        {
            case  0: res="T080000"; break;
            case  1: res="T083000"; break;
            case  2: res="T090000"; break;
            case  3: res="T093000"; break;
            case  4: res="T100000"; break;
            case  5: res="T103000"; break;
            case  6: res="T110000"; break;
            case  7: res="T113000"; break;
            case  8: res="T120000"; break;
            case  9: res="T123000"; break;
            case 10: res="T130000"; break;
            case 11: res="T133000"; break;
            case 12: res="T140000"; break;
            case 13: res="T143000"; break;
            case 14: res="T150000"; break;
            case 15: res="T153000"; break;
            case 16: res="T160000"; break;
            case 17: res="T163000"; break;
            case 18: res="T170000"; break;
            case 19: res="T173000"; break;
            case 20: res="T180000"; break;
            case 21: res="T183000"; break;
            case 22: res="T190000"; break;
            case 23: res="T193000"; break;
            case 24: res="T200000"; break;
            case 25: res="T203000"; break;
            case 26: res="T210000"; break;
            case 27: res="T213000"; break;
            case 28: res="T220000"; break;
            case 29: res="T223000"; break;
            default: res="T230000"; break;
        }
        return res;
    }
    
    String ExportFecha(int d){
        switch (d) {
            case 1: return "02";
            case 2: return "03";
            case 3: return "04";
            case 4: return "05";
            case 5: return "06";
            case 6: return "07";
           default: return "08";
        }
    }
    private void BotonExportar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportar
      
        Clase[] horario=soluciones.get(Integer.parseInt(jTextField2.getText())-1).clases;
        
        //Crea el .ics
        String export="BEGIN:VCALENDAR\r\n";
        for (int i=0; i < horario.length; i++){
            export += "BEGIN:VEVENT\r\nSUMMARY:"+horario[i].asig
                    + "\r\nDTSTART;TZID=Europe/Madrid:201201"+ExportFecha(horario[i].dia)+ExportHora(horario[i].horaini)
                    + "\r\nDTEND;TZID=Europe/Madrid:201201"+ExportFecha(horario[i].dia)+ExportHora(horario[i].horafin)
                    + "\r\nRRULE:FREQ=WEEKLY;BYDAY="+ExportDia(horario[i].dia)+"\r\nEND:VEVENT\r\n";
        }
        export += "END:VCALENDAR";
              
        //Guardar en fichero
//        try{ 
//            javax.swing.JFileChooser jF1=new javax.swing.JFileChooser(); ;
//            String direccion; 
//            FileWriter  Guardx;
//            File f= new File("horario.ics"); 
//            boolean guardado=false;
//
//            while (!guardado)
//            {
//                if(jF1.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
//                { 
//                    jF1.setSelectedFile(f); 
//                    direccion = jF1.getSelectedFile().getAbsolutePath(); 
//                    Guardx=new FileWriter(direccion);
//                    f = new File(direccion);
//                    
//                    if(f.exists() && (JOptionPane.NO_OPTION == JOptionPane.showConfirmDialog(this,"Ya existe un fichero con este nombre. ¿Deseas reemplazarlo?","Fichero existente",JOptionPane.YES_NO_OPTION)))
//                    {
//                        //nada
//                    }
//                    else
//                    {
//                        Guardx.write(export);
//                        Guardx.close(); 
//                        JOptionPane.showMessageDialog(this,"Exportado correctamente. ","Exportar",JOptionPane.INFORMATION_MESSAGE);
//                        guardado=true;
//                    }
//                }
//            }
        javax.swing.JFileChooser jF1= new javax.swing.JFileChooser(); 
        File f = new File("horario.ics"); 
        jF1.setSelectedFile(f); 
        try{ 
            if(jF1.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
            { 
                String direccion = jF1.getSelectedFile().getAbsolutePath(); 
                FileWriter  Guardx=new FileWriter(direccion);
                Guardx.write(export);
                Guardx.close(); 
                JOptionPane.showMessageDialog(this,"Horario exportado.","Exportar",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (Exception ex){ 

            System.err.println("Fallo al guardar.");

        } 
        
    }//GEN-LAST:event_BotonExportar

    private void menuVolver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolver
        
        anterior.setVisible(true);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_menuVolver

    void actualizaHorario(){
        
        int seleccion = Integer.parseInt(jTextField2.getText())-1;
        
        if (seleccion > -1 && seleccion< soluciones.size()){
            Dibuja(soluciones.get(seleccion));
        }
    }
         
    
    public void Dibuja(Horario h){
        
        Clase[] c= h.clases;
        
        //Limpia
        for (int i=1; i < 8; i++){
            for (int j=0; j < 31; j++) {
                tablaHorario.setValueAt("",j,i);
            }
        }
        
        //Dibuja
        for (int i=0; i < c.length; i++)
        {
            tablaHorario.setValueAt(c[i].asig, c[i].horaini, c[i].dia);
            
            //Dibuja guiones por debajo
            for (int j=c[i].horaini+1; j < c[i].horafin ; j++) {
                tablaHorario.setValueAt("-", j, c[i].dia);
            }
            
            //Actualiza tabla de asignaturas
            tablaAsigs.setValueAt(c[i].toString(),i,1);
        }
        
        
        
        //Salida por terminal
        System.out.println("-----Horario "+jTextField2.getText()+"-----\n"
                       +"Dias con clases:\n"
                       +h.totaldias
                       +"\n\nAsignaturas:\n"
                       +h.dias[0].numasignaturas+","
                       +h.dias[1].numasignaturas+","
                       +h.dias[2].numasignaturas+","
                       +h.dias[3].numasignaturas+","
                       +h.dias[4].numasignaturas+","
                       +h.dias[5].numasignaturas+","
                       +h.dias[6].numasignaturas
                       +"\n\nMedias-horas en la uni: \n"
                       +h.dias[0].tiempoEnLaUni+"+"
                       +h.dias[1].tiempoEnLaUni+"+"
                       +h.dias[2].tiempoEnLaUni+"+"
                       +h.dias[3].tiempoEnLaUni+"+"
                       +h.dias[4].tiempoEnLaUni+"+"
                       +h.dias[5].tiempoEnLaUni+"+"
                       +h.dias[6].tiempoEnLaUni+"="
                       +h.tiempoEnLaUni
                       +"\n\nMedias-horas muertas:\n"
                       +h.dias[0].horasmuertas+"+"
                       +h.dias[1].horasmuertas+"+"
                       +h.dias[2].horasmuertas+"+"
                       +h.dias[3].horasmuertas+"+"
                       +h.dias[4].horasmuertas+"+"
                       +h.dias[5].horasmuertas+"+"
                       +h.dias[6].horasmuertas+"="
                       +h.horasmuertas
                       +"\n\nMedia y desviacion hora de entrada;\n"
                       +h.mediaEntrada+", "+h.desviacionHoraEntrada
                       +"\n\nMedia y desviacion num asignaturas:\n"
                       +h.mediasig+", "+h.desviacionNumAsignaturas
                       +"\n\nDias tiempo para comer:\n"
                       +h.diasconlahoradelacomidalibre+"\n");
    }
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VistaHorarios(soluciones,asignaturas,anterior).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables


    //Carga editor de ComboBox para la tabla de asignaturas
    private class MyComboEditor extends DefaultCellEditor{

            List<String[]> values;

            public MyComboEditor(List<String[]> values){
                    super(new JComboBox());
                    this.values = values;
            }

        @Override
            public Component getTableCellEditorComponent(JTable table, Object value,
                        boolean isSelected, int row, int column) {

                    JComboBox combo = (JComboBox)getComponent();
                    combo.removeAllItems();
                    String[] valores = values.get(row);

                    for(int i=0; i<valores.length; i++){
                            combo.addItem(valores[i]);
                    }
                    combo.setSelectedItem(value);

                    return combo;
            }
    }
}
