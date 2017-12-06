/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov_17;
import POO1.Quadrado;

public class JanelaQuadrado extends javax.swing.JInternalFrame {

    public JanelaQuadrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btImprimir = new javax.swing.JButton();
        tfLado = new javax.swing.JTextField();
        lbLado = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        spResultado = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();

        setClosable(true);
        setResizable(true);
        setTitle("Propriedades do Quadrado");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setVisible(false);

        btImprimir.setText("Imprimir");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        tfLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLadoActionPerformed(evt);
            }
        });

        lbLado.setText("Lado:");

        btLimpar.setText("Limpar");
        btLimpar.setAlignmentY(0.0F);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        result.setColumns(20);
        result.setRows(5);
        spResultado.setViewportView(result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btImprimir)
                        .addGap(0, 159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btImprimir)
                    .addComponent(tfLado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(spResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLadoActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
                                         
    try{
        result.setText("");
    
        double raio = Double.parseDouble(tfLado.getText());
   
       Quadrado quadrado = new Quadrado(raio);
    
        result.append(String.format("Lado: %.2f\n", quadrado.getLado()));
        result.append("------------------------------------------------------\n");
        result.append(String.format("Diagonal: %.2f\n", quadrado.diagonal()));
        result.append("------------------------------------------------------\n");
        result.append(String.format("Perímetro: %.2f\n", quadrado.perimetro()));
        result.append("------------------------------------------------------\n");
        result.append(String.format("Área: %.2f\n", quadrado.area()));
        result.append("------------------------------------------------------\n");
      
    }
    catch(NumberFormatException erro){
        result.append("Entrada Inválida!"+ "\n");
    }
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        result.setText("");
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel lbLado;
    private javax.swing.JTextArea result;
    private javax.swing.JScrollPane spResultado;
    private javax.swing.JTextField tfLado;
    // End of variables declaration//GEN-END:variables
}