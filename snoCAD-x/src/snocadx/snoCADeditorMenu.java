/*
 * Copyright 2007-2014 Daniel Graf (https://github.com/danielgraf)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * snoCADeditorMenu.java
 *
 * Created on 25 March 2007, 14:36
 */

package snocadx;
import java.awt.geom.AffineTransform;
import java.io.IOException;

/**
 *
 * @author  dgraf
 */
public class snoCADeditorMenu extends javax.swing.JPanel {
    
    /** Creates new form snoCADeditorMenu */
    public snoCADeditorMenu() {
        initComponents();
        m_lastUsedPath = null;
        saveFile.setEnabled(m_lastUsedPath != null);

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        m_snoCADeditorMenu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        saveFile = new javax.swing.JMenuItem();
        saveFileAs = new javax.swing.JMenuItem();
        exportFile = new javax.swing.JMenuItem();
        exportTemplateFullsize = new javax.swing.JMenuItem();
        exportTemplateSplit = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        exportHTMLtable = new javax.swing.JMenu();
        horizontalExport = new javax.swing.JMenuItem();
        verticalExport = new javax.swing.JMenuItem();
        exportGraphics = new javax.swing.JMenuItem();
        exportDossier = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        exportWorkspaceImage = new javax.swing.JMenuItem();
        exportCoreImage = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        close = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        editMode = new javax.swing.JMenu();
        editBoard = new javax.swing.JRadioButtonMenuItem();
        editCore = new javax.swing.JRadioButtonMenuItem();
        editGraphics = new javax.swing.JRadioButtonMenuItem();
        View = new javax.swing.JMenu();
        RenderBoard = new javax.swing.JCheckBoxMenuItem();
        Highlights = new javax.swing.JCheckBoxMenuItem();
        gridToggle = new javax.swing.JCheckBoxMenuItem();
        axesToggle = new javax.swing.JCheckBoxMenuItem();
        Tools = new javax.swing.JMenu();
        railShaper = new javax.swing.JMenuItem();
        coreShaper = new javax.swing.JMenuItem();
        editModeGroup = new javax.swing.ButtonGroup();

        File.setText("File");
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnSaveFile(evt);
            }
        });

        File.add(saveFile);

        saveFileAs.setText("Save As...");
        saveFileAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBoardAs(evt);
            }
        });

        File.add(saveFileAs);

        exportFile.setText("Export DXF...");
        exportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportDXF(evt);
            }
        });

        File.add(exportFile);

        exportTemplateFullsize.setText("Export Fullsize PDF Template...");
        exportTemplateFullsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportFullsizeTemplate(evt);
            }
        });

        File.add(exportTemplateFullsize);

        exportTemplateSplit.setText("Export Split PDF Template...");
        exportTemplateSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportSplitTemplate(evt);
            }
        });

        File.add(exportTemplateSplit);

        File.add(jSeparator2);

        exportHTMLtable.setText("Export HTML Dimension Table");
        horizontalExport.setText("Horizontal Export...");
        horizontalExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnHorizontalExport(evt);
            }
        });

        exportHTMLtable.add(horizontalExport);

        verticalExport.setText("Vertical Export...");
        verticalExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnVerticalExport(evt);
            }
        });

        exportHTMLtable.add(verticalExport);

        File.add(exportHTMLtable);

        exportGraphics.setText("Export Graphics to PDF...");
        exportGraphics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportGraphics(evt);
            }
        });

        File.add(exportGraphics);

        exportDossier.setText("Export Design Spec PDF...");
        exportDossier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportDossier(evt);
            }
        });

        File.add(exportDossier);

        File.add(jSeparator4);

        exportWorkspaceImage.setText("Export PNG Image of Board...");
        exportWorkspaceImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportBoardImage(evt);
            }
        });

        File.add(exportWorkspaceImage);

        exportCoreImage.setText("Export PNG Image of Core...");
        exportCoreImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnExportCoreImage(evt);
            }
        });

        File.add(exportCoreImage);

        File.add(jSeparator5);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnCloseWindow(evt);
            }
        });

        File.add(close);

        m_snoCADeditorMenu.add(File);

        Edit.setText("Edit");
        editMode.setText("Editing Mode");
        editModeGroup.add(editBoard);
        editBoard.setSelected(true);
        editBoard.setText("Edit Geometry");
        editBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnSetEditBoard(evt);
            }
        });

        editMode.add(editBoard);

        editModeGroup.add(editCore);
        editCore.setText("Edit Core");
        editCore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnSetEditCore(evt);
            }
        });

        editMode.add(editCore);

        editModeGroup.add(editGraphics);
        editGraphics.setText("Edit Graphics");
        editGraphics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnSetEditGraphics(evt);
            }
        });

        editMode.add(editGraphics);

        Edit.add(editMode);

        m_snoCADeditorMenu.add(Edit);

        View.setText("View");
        RenderBoard.setSelected(true);
        RenderBoard.setText("Shade Board");
        RenderBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChangeRenderBoard(evt);
            }
        });

        View.add(RenderBoard);

        Highlights.setSelected(true);
        Highlights.setText("Highlights");
        Highlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnChangeHighlights(evt);
            }
        });

        View.add(Highlights);

        gridToggle.setSelected(true);
        gridToggle.setText("Show Grid");
        gridToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnGridToggle(evt);
            }
        });

        View.add(gridToggle);

        axesToggle.setSelected(true);
        axesToggle.setText("Show Axes");
        axesToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnAxesToggle(evt);
            }
        });

        View.add(axesToggle);

        m_snoCADeditorMenu.add(View);

        Tools.setText("Tools");
        railShaper.setText("Rail Shaper");
        railShaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOpenRailShaper(evt);
            }
        });

        Tools.add(railShaper);

        coreShaper.setText("Core Shaper");
        coreShaper.setEnabled(false);
        coreShaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOpenCoreShaper(evt);
            }
        });

        Tools.add(coreShaper);

        m_snoCADeditorMenu.add(Tools);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 24, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OnExportSplitTemplate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportSplitTemplate

        Object[] expPossibilities = {"Board Outline", "Core Outline", "Nose Tipspacer", "Tail Tipspacer", "Board Profile", "Flex Profile"};
        int object = snoCADutilities.EDIT_BOARD;
        
        String tType = (String)javax.swing.JOptionPane.showInputDialog(
                    m_editor,
                    "Select a template",
                    "Split Template...",
                    javax.swing.JOptionPane.PLAIN_MESSAGE,
                    null,
                    expPossibilities,
                    "Board Outline");
        
        if ((tType != null) && (tType.length() > 0)) 
        {
            if (tType == "Board Outline") { object = snoCADutilities.EDIT_BOARD;}
            if (tType == "Core Outline")  { object = snoCADutilities.EDIT_CORE;}
            if (tType == "Nose Tipspacer")  { object = snoCADutilities.EDIT_NOSE_TIPSPACER;}
            if (tType == "Tail Tipspacer")  { object = snoCADutilities.EDIT_TAIL_TIPSPACER;}
            if (tType == "Board Profile") { object = snoCADutilities.EDIT_PROFILE;}
            if (tType == "Flex Profile") { object = snoCADutilities.EDIT_FLEX;}
        }
        else
        {
            return;
        }
        
        Object[] possibilities = {"A3", "A3+", "A4", "Legal", "Letter"};
        
        String s = (String)javax.swing.JOptionPane.showInputDialog(
                    m_editor,
                    "Select a paper size",
                    "Split Template...",
                    javax.swing.JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "A4");

        int width = 0;
        int height = 0;
        
        //If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) 
        {
            if (s == "A4") { width = 297; height = 210;}
            if (s == "A3") { width = 420; height = 297;}
            if (s == "A3+") { width = 483 ; height = 329 ;}
            if (s == "Letter") { width = 279; height = 216;}
            if (s == "Legal") { width = 356; height = 216;}
            
            
            
        }
        else
        {
            return;
        }
        


        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getPDFfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_" + tType.toLowerCase().replace(" ", "_") + "_split_template.pdf"));
        fc.setDialogTitle("Export PDF...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File pdf = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = pdf.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!pdf.getName().toLowerCase().endsWith(".pdf"))
            {
                 // File (or directory) with new name
                 pdf = new java.io.File(pdf.getAbsolutePath() + ".pdf");
                 
                 // Rename file (or directory)
                 boolean success = pdf.renameTo(pdf);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (pdf != null)
            {
                   snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                   pdfExport.setBoardDisplay(m_bp);
                   pdfExport.setBoard(m_bp.getBoard());
                   pdfExport.exportSplitTemplate(pdf, width, height, object);
              
            }
        }
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportSplitTemplate

    private void OnExportFullsizeTemplate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportFullsizeTemplate
 
        int object = snoCADutilities.EDIT_BOARD;
        
        Object[] expPossibilities = {"Board Outline", "Core Outline", "Nose Tipspacer", "Tail Tipspacer", "Board Profile", "Flex Profile"};
        
        String tType = (String)javax.swing.JOptionPane.showInputDialog(
                    m_editor,
                    "Select a template",
                    "Split Template...",
                    javax.swing.JOptionPane.PLAIN_MESSAGE,
                    null,
                    expPossibilities,
                    "Board Outline");
        
        if ((tType != null) && (tType.length() > 0)) 
        {
            if (tType == "Board Outline") { object = snoCADutilities.EDIT_BOARD;}
            if (tType == "Core Outline")  { object = snoCADutilities.EDIT_CORE;}
            if (tType == "Nose Tipspacer")  { object = snoCADutilities.EDIT_NOSE_TIPSPACER;}
            if (tType == "Tail Tipspacer")  { object = snoCADutilities.EDIT_TAIL_TIPSPACER;}
            if (tType == "Board Profile") { object = snoCADutilities.EDIT_PROFILE;}
            if (tType == "Flex Profile") { object = snoCADutilities.EDIT_FLEX;}
             
        }
        else
        {
            return;
        }
        
        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getPDFfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_" + tType.toLowerCase().replace(" ", "_") + "_full_template.pdf"));
        fc.setDialogTitle("Export PDF...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File pdf = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = pdf.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!pdf.getName().toLowerCase().endsWith(".pdf"))
            {
                 // File (or directory) with new name
                 pdf = new java.io.File(pdf.getAbsolutePath() + ".pdf");
                 
                 // Rename file (or directory)
                 boolean success = pdf.renameTo(pdf);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (pdf != null)
            {
                   snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                   pdfExport.setBoardDisplay(m_bp);
                   pdfExport.setBoard(m_bp.getBoard());
                   pdfExport.exportFullsizeTemplate(pdf, object);
            }
        }
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportFullsizeTemplate

    private void OnVerticalExport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnVerticalExport

        m_editor.getStatsPanel().exportDimensions(true);
    }//GEN-LAST:event_OnVerticalExport

    private void OnHorizontalExport(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnHorizontalExport
        m_editor.getStatsPanel().exportDimensions(false);
    }//GEN-LAST:event_OnHorizontalExport

    private void OnExportDossier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportDossier

        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getPDFfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_design_spec.pdf"));
        fc.setDialogTitle("Export PDF...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File pdf = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = pdf.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!pdf.getName().toLowerCase().endsWith(".pdf"))
            {
                 // File (or directory) with new name
                 pdf = new java.io.File(pdf.getAbsolutePath() + ".pdf");
                 
                 // Rename file (or directory)
                 boolean success = pdf.renameTo(pdf);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (pdf != null)
            {
                   snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                   pdfExport.setBoardDisplay(m_bp);
                   pdfExport.setBoard(m_bp.getBoard());
                   pdfExport.exportBoardDossier(pdf);
            }
        }
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportDossier

    private void OnExportCoreImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportCoreImage

        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getPNGfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_core_view.png"));
        fc.setDialogTitle("Export PNG...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File png = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = png.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!png.getName().toLowerCase().endsWith(".png"))
            {
                 // File (or directory) with new name
                 png = new java.io.File(png.getAbsolutePath() + ".png");
                 
                 // Rename file (or directory)
                 boolean success = png.renameTo(png);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (png != null)
            {
                    snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                    pdfExport.setBoardDisplay(m_bp);
                    pdfExport.setBoard(m_bp.getBoard());
                    pdfExport.exportBoardImage(png, 1);
            }
        } 
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportCoreImage

    private void OnExportBoardImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportBoardImage

        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getPNGfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_top_view.png"));
        fc.setDialogTitle("Export PNG...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File png = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = png.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!png.getName().toLowerCase().endsWith(".png"))
            {
                 // File (or directory) with new name
                 png = new java.io.File(png.getAbsolutePath() + ".png");
                 
                 // Rename file (or directory)
                 boolean success = png.renameTo(png);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (png != null)
            {
                    snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                    pdfExport.setBoardDisplay(m_bp);
                    pdfExport.setBoard(m_bp.getBoard());
                    pdfExport.exportBoardImage(png, 0);
            }
        } 
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportBoardImage

    private void OnExportGraphics(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportGraphics
        
       // final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        final snoCADPDFexporterPanel fc = new snoCADPDFexporterPanel(m_lastUsedPath);
      //  javax.swing.JCheckBox baseFlag = new javax.swing.JCheckBox();
     //   baseFlag.setText("Base");
     
     //baseFlag.setSelected(false);
      //  baseFlag.setSize(50,50);
      //  fc.add(baseFlag);
        fc.setFileFilter(new snoCADfileFilters().getPDFfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + "_graphics.pdf"));
        fc.setDialogTitle("Export PDF...");
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File pdf = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = pdf.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!pdf.getName().toLowerCase().endsWith(".pdf"))
            {
                 // File (or directory) with new name
                 pdf = new java.io.File(pdf.getAbsolutePath() + ".pdf");
                 
                 // Rename file (or directory)
                 boolean success = pdf.renameTo(pdf);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (pdf != null)
            {
                   snoCADpdfExporter pdfExport = new snoCADpdfExporter();
                   pdfExport.setBoardDisplay(m_bp);
                   pdfExport.setBoard(m_bp.getBoard());
                   pdfExport.exportBoardGraphics(pdf, fc.getFilter().getShrink(), fc.getFilter().getRGB());
                 
            }
        }
        else 
        {
            // File was not opened
        }
        
    }//GEN-LAST:event_OnExportGraphics

    private void OnOpenCoreShaper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOpenCoreShaper
        m_coreShaper.setupVariables();
        m_coreShaper.setVisible(true);
    }//GEN-LAST:event_OnOpenCoreShaper

    private void OnSetEditGraphics(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnSetEditGraphics
        m_bp.setEditingMode(snoCADutilities.EDIT_GRAPHICS);
        this.m_editor.m_graphicsPanel.setVisible(true);
        railShaper.setEnabled(false);
        coreShaper.setEnabled(false);
        m_bp.repaint();
    }//GEN-LAST:event_OnSetEditGraphics

    private void OnSetEditCore(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnSetEditCore
        m_bp.setEditingMode(snoCADutilities.EDIT_CORE);
        this.m_editor.m_graphicsPanel.setVisible(false);
        railShaper.setEnabled(false);
        coreShaper.setEnabled(true);
        m_bp.requestFocusInWindow();
        m_bp.repaint();
    }//GEN-LAST:event_OnSetEditCore

    private void OnSetEditBoard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnSetEditBoard
        m_bp.setEditingMode(snoCADutilities.EDIT_BOARD);
        this.m_editor.m_graphicsPanel.setVisible(false);
        railShaper.setEnabled(true);
        coreShaper.setEnabled(false);
        m_bp.requestFocusInWindow();
        m_bp.repaint();
    }//GEN-LAST:event_OnSetEditBoard

    private void OnOpenRailShaper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOpenRailShaper
        
        m_optionsDialog.setupVariables();
        m_optionsDialog.setVisible(true);
        
    }//GEN-LAST:event_OnOpenRailShaper

    private void OnExportDXF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnExportDXF
        
        
        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getDXFfilter());
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + ".dxf"));
        fc.setDialogTitle("Export DXF...");
        snoCADdxfExportFilter pExp = new snoCADdxfExportFilter();
        fc.add(pExp);
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File dxf = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = dxf.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!dxf.getName().toLowerCase().endsWith(".dxf"))
            {
                 // File (or directory) with new name
                 dxf = new java.io.File(dxf.getAbsolutePath() + ".dxf");
                 
                 // Rename file (or directory)
                 boolean success = dxf.renameTo(dxf);
                 
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (dxf != null)
            {
                    snoCADmanualDXFexporter dxfOut = new snoCADmanualDXFexporter();
                    dxfOut.createDXF(m_bp, m_bp.getBoard(), dxf, pExp);
            }
        } 
        else 
        {
            // File was not opened
        }
    }//GEN-LAST:event_OnExportDXF

    private void OnCloseWindow(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnCloseWindow
       m_editor.dispose();
       m_optionsDialog.dispose();
    }//GEN-LAST:event_OnCloseWindow

    private void OnSaveFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnSaveFile
// TODO add your handling code here:
                   m_bp.getBoard().saveBoard(new java.io.File(m_snxFilename));           
    }//GEN-LAST:event_OnSaveFile

    private void OnChangeHighlights(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnChangeHighlights
        m_bp.setHightlights(Highlights.getState());
        m_bp.repaint();
    }//GEN-LAST:event_OnChangeHighlights

    private void OnAxesToggle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnAxesToggle

        m_bp.setAxes(axesToggle.getState());
        m_bp.repaint();
    }//GEN-LAST:event_OnAxesToggle

    private void OnGridToggle(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnGridToggle

        m_bp.setGrid(gridToggle.getState());
        m_bp.repaint();
    }//GEN-LAST:event_OnGridToggle

    private void saveBoardAs(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBoardAs
        
        try
        {
        if ((m_lastUsedPath == "") || (m_lastUsedPath == null)) m_lastUsedPath = Main.getProjectFolder();
        
        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser(m_lastUsedPath);
        
        fc.setFileFilter(new snoCADfileFilters().getSnoCADxFileFilter());
        
        fc.setDialogTitle("Save Board as...");
        
        fc.setSelectedFile(new java.io.File(m_bp.getBoard().getBoardName().replace(" ", "_") + ".snx"));
        
        int returnVal = fc.showSaveDialog(snoCADeditorMenu.this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File snoCADxFile = fc.getSelectedFile();
            
            try 
            {
                m_lastUsedPath = snoCADxFile.getCanonicalPath();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
            
            if (!snoCADxFile.getName().toLowerCase().endsWith(".snx"))
            {
                 // File (or directory) with new name
                 snoCADxFile = new java.io.File(snoCADxFile.getAbsolutePath() + ".snx");
                 
                 // Rename file (or directory)
                 boolean success = snoCADxFile.renameTo(snoCADxFile);
                
                 if (!success) 
                 {
                     // File was not successfully renamed
                 }
            }

            if (snoCADxFile != null)
            {
                    m_bp.getBoard().saveBoard(snoCADxFile); 
                    m_editor.setTitle(snoCADxFile.getName());
                    m_snxFilename = m_lastUsedPath;
                    
                    saveFile.setEnabled(m_snxFilename != null);
                    
            }
        } 
        else 
        {
            // File was not opened
        }
        }
        catch(java.lang.Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_saveBoardAs
    public void setBoardPanel(snoCADboardDisplay bp) 
    {
        m_bp = bp;
        m_optionsDialog = new snoCADrailShaper(m_bp);
        m_optionsDialog.setLocationRelativeTo(this);
        m_optionsDialog.setTitle("Rail Shaper");
        
        m_coreShaper = new snoCADcoreShaper(m_bp);
        m_coreShaper.setLocationRelativeTo(this);
        m_coreShaper.setTitle("Core Shaper");
        
        javax.swing.ImageIcon iconImage = new javax.swing.ImageIcon(Main.class.getResource("images/sno2.gif")); 
        if (iconImage.getImage() != null) 
        {
            m_optionsDialog.setIconImage(iconImage.getImage());
            m_coreShaper.setIconImage(iconImage.getImage());
        }
        
    }
    
    private void onChangeRenderBoard(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onChangeRenderBoard
    
        m_bp.setRenderBoard(RenderBoard.getState());
        Highlights.setEnabled(RenderBoard.getState());
        m_bp.repaint();
    }//GEN-LAST:event_onChangeRenderBoard
    
    public javax.swing.JMenuBar getMenu() { return m_snoCADeditorMenu;}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JCheckBoxMenuItem Highlights;
    private javax.swing.JCheckBoxMenuItem RenderBoard;
    private javax.swing.JMenu Tools;
    private javax.swing.JMenu View;
    private javax.swing.JCheckBoxMenuItem axesToggle;
    private javax.swing.JMenuItem close;
    private javax.swing.JMenuItem coreShaper;
    private javax.swing.JRadioButtonMenuItem editBoard;
    private javax.swing.JRadioButtonMenuItem editCore;
    private javax.swing.JRadioButtonMenuItem editGraphics;
    private javax.swing.JMenu editMode;
    private javax.swing.ButtonGroup editModeGroup;
    private javax.swing.JMenuItem exportCoreImage;
    private javax.swing.JMenuItem exportDossier;
    private javax.swing.JMenuItem exportFile;
    private javax.swing.JMenuItem exportGraphics;
    private javax.swing.JMenu exportHTMLtable;
    private javax.swing.JMenuItem exportTemplateFullsize;
    private javax.swing.JMenuItem exportTemplateSplit;
    private javax.swing.JMenuItem exportWorkspaceImage;
    private javax.swing.JCheckBoxMenuItem gridToggle;
    private javax.swing.JMenuItem horizontalExport;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuBar m_snoCADeditorMenu;
    private javax.swing.JMenuItem railShaper;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem saveFileAs;
    private javax.swing.JMenuItem verticalExport;
    // End of variables declaration//GEN-END:variables
    
    private snoCADboardDisplay m_bp;
    private snoCADeditor m_editor;
    private String m_lastUsedPath ;
    private snoCADrailShaper m_optionsDialog;
    private snoCADcoreShaper m_coreShaper;
    private String m_snxFilename;
    
    public void setLastUsedPath(String path) { m_lastUsedPath = path; saveFile.setEnabled(true); }
    public void setSnxFileName(String filename) { m_snxFilename = filename;}
    public void setEditor (snoCADeditor editor) { m_editor = editor;}
}
