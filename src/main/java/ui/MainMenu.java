
package ui;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Acao;
import model.Ferramentas;
import model.Observador;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.time.MovingAverage;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author mateus
 */
public class MainMenu extends javax.swing.JFrame implements Observador {

    public static ArrayList<Acao> acoes = new ArrayList<>();
    private AddCSV telaAddCSV = null;
    private Tools telaTools = null;
    private Settings telaSettings = null;
    private Help telaHelp = null;
    private Boolean design = false;
    private Boolean media = false;


    public MainMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.telaAddCSV = new AddCSV();
        telaAddCSV.registrarObservador(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuLateral = new javax.swing.JPanel();
        jPanelBotoes = new javax.swing.JPanel();
        jLabelDashboard = new javax.swing.JLabel();
        jLabelTools = new javax.swing.JLabel();
        jLabelSettings = new javax.swing.JLabel();
        jLabelHelp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAddcsv = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JXCHANGE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelMenuLateral.setBackground(new java.awt.Color(24, 24, 24));
        jPanelMenuLateral.setPreferredSize(new java.awt.Dimension(300, 720));

        jPanelBotoes.setBackground(new java.awt.Color(24, 24, 24));
        jPanelBotoes.setLayout(new java.awt.GridLayout(8, 1));

        jLabelDashboard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-dash.png"))); // NOI18N
        jLabelDashboard.setText("Dashboard");
        jLabelDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDashboard.setIconTextGap(6);
        jPanelBotoes.add(jLabelDashboard);

        jLabelTools.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTools.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-tools.png"))); // NOI18N
        jLabelTools.setText("Tools");
        jLabelTools.setIconTextGap(6);
        jLabelTools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelToolsMousePressed(evt);
            }
        });
        jPanelBotoes.add(jLabelTools);

        jLabelSettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-config.png"))); // NOI18N
        jLabelSettings.setText("Settings");
        jLabelSettings.setIconTextGap(6);
        jLabelSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSettingsMousePressed(evt);
            }
        });
        jPanelBotoes.add(jLabelSettings);

        jLabelHelp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHelp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-ajuda.png"))); // NOI18N
        jLabelHelp.setText("Help");
        jLabelHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHelp.setIconTextGap(6);
        jLabelHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHelpMousePressed(evt);
            }
        });
        jPanelBotoes.add(jLabelHelp);
        jPanelBotoes.add(jLabel1);
        jPanelBotoes.add(jLabel2);

        jLabelAddcsv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAddcsv.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddcsv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-addcsv.png"))); // NOI18N
        jLabelAddcsv.setText("New Exchange");
        jLabelAddcsv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddcsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAddcsvMousePressed(evt);
            }
        });
        jPanelBotoes.add(jLabelAddcsv);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logotipo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(45, 45, 45))
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addGap(143, 143, 143))
        );

        getContentPane().add(jPanelMenuLateral, java.awt.BorderLayout.LINE_START);

        painelPrincipal.setBackground(new java.awt.Color(29, 28, 33));
        painelPrincipal.setLayout(new java.awt.BorderLayout());

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.add(jTabbedPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSettingsMousePressed
    
        if (telaSettings == null) {
            telaSettings = new Settings();
            telaSettings.setVisible(true);
            telaSettings.registrarObservador(telaAddCSV);
        } else {
            telaSettings.setVisible(true);
        }

    }//GEN-LAST:event_jLabelSettingsMousePressed

    private void jLabelHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHelpMousePressed
        if (telaHelp == null) {
            telaHelp = new Help();
            telaHelp.setVisible(true);
        } else {
            telaHelp.setVisible(true);
        }
    }//GEN-LAST:event_jLabelHelpMousePressed

    private void jLabelToolsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolsMousePressed

        if (telaTools == null) {
            telaTools = new Tools();
            telaTools.registrarObservador(this);
            telaTools.setVisible(true);
        } else {
            telaTools.setVisible(true);
        }

    }//GEN-LAST:event_jLabelToolsMousePressed

    private void jLabelAddcsvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddcsvMousePressed

        if (telaAddCSV == null) {
            telaAddCSV = new AddCSV();
            telaAddCSV.setVisible(true);
        } else {
            telaAddCSV.setVisible(true);
        }
    }//GEN-LAST:event_jLabelAddcsvMousePressed
   
    private void apresentaGraficosNormais(){
         
        int cont = 0;
        
        for(Acao c : acoes){
           try {
                JFreeChart chart = ChartFactory.createCandlestickChart(c.getNomeAcao(),"Data","Valor", c.getDataset(), true);
                chart.removeLegend();
                ChartPanel painelGrafico = new ChartPanel(chart);               
                painelGrafico.setMouseZoomable(true);
                painelGrafico.setMouseWheelEnabled(true);
                painelGrafico.setName(c.getNomeAcao());
                painelGrafico.getChart().getPlot().setBackgroundPaint(Color.WHITE);
                jTabbedPane.add(painelGrafico);
                jTabbedPane.setTitleAt(cont++, c.getNomeAcao());             
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e); 
            } 
        }
            
        
    }
    public void montagraficoNormal(){
        
        Acao c = acoes.get(acoes.size() - 1);   
            try {
                JFreeChart chart = ChartFactory.createCandlestickChart(c.getNomeAcao(),"Data","Valor", c.getDataset(), true);
                chart.removeLegend();
                ChartPanel painelGrafico = new ChartPanel(chart);               
                painelGrafico.setMouseZoomable(true);
                painelGrafico.setMouseWheelEnabled(true);
                painelGrafico.setName(c.getNomeAcao());        
                painelGrafico.getChart().getPlot().setBackgroundPaint(Color.WHITE);
                jTabbedPane.add(painelGrafico);
                jTabbedPane.setTitleAt(acoes.size()-1, c.getNomeAcao());             
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e); 
            }
        
    }
    private void listarGraficosPersonalizados() {

        int cont = 0;

        jTabbedPane.removeAll();

        for (Acao c : acoes) {
            try {
                Ferramentas f = new Ferramentas(c);
                ChartPanel painelGrafico = new ChartPanel(f.montaOHLCSeriesChart());
                painelGrafico.setName(c.getNomeAcao());
                painelGrafico.setMouseWheelEnabled(true);
                painelGrafico.setMouseZoomable(true);
                jTabbedPane.add(painelGrafico);
                jTabbedPane.setTitleAt(cont++, c.getNomeAcao());
 
                
                XYPlot xyplot = (XYPlot) painelGrafico.getChart().getPlot();
          
                XYDataset dataset1 = MovingAverage.createMovingAverage(xyplot.getDataset(1), "-MA30", 1000L * 60L *60L * 24L ,  0L);  
                xyplot.setDataset(1, dataset1);
                xyplot.setRenderer(1, new StandardXYItemRenderer());

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }
    
    
    private void apresentaGraficos() {
        //verifica qual o desgin do gráfico selecionado
        if (this.design) {
            listarGraficosPersonalizados();
        } else {
            montagraficoNormal();
        }
    }

    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddcsv;
    private javax.swing.JLabel jLabelDashboard;
    private javax.swing.JLabel jLabelHelp;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSettings;
    private javax.swing.JLabel jLabelTools;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Boolean b) {
        
        //verifica se houve sucesso em ler o arquivo csv. Em caso afirmativo, é realizado a apresentação dos gráficos
        if (b){  
           apresentaGraficos();
        }
    }

    @Override
    public void update(Boolean[] b) {
        
        
        //verifica o array de opções para tomar ações
        if (b[2]) {
            jTabbedPane.removeAll();
            acoes.removeAll(acoes);
            this.design = b[0];
        } else {
            this.design = b[0];
            this.media = b[1];
        }
        
        if( media == false){
            if(design){
               jTabbedPane.removeAll();
               listarGraficosPersonalizados(); 
            }else{
                jTabbedPane.removeAll();
                apresentaGraficosNormais();
            }
            
        } 
        
    }
    
     @Override
    public void update(int periodo) {
        
        int cont = 0;
        int index = jTabbedPane.getSelectedIndex();    
        
        for( Acao c: acoes){     
            //verifica qual a TAB selecionada para plotar média apenas no gráfico em visualização
            if(cont == index && media){
               ChartPanel painelGrafico = (ChartPanel) jTabbedPane.getComponent(index);         
               c.calculaMMA(painelGrafico, periodo);
            }
            cont++;
        }        
    }
    
    @Override
    public void update(String diretorio) {
  
    }

}
