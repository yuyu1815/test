/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalEventsHandler;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseFormat;
/*     */ import com.jediterm.terminal.emulator.mouse.MouseMode;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseWheelEvent;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.Arrays;
/*     */ import javax.swing.SwingUtilities;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000|\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\020\f\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\020\022\n\002\b\003\n\002\020\016\n\002\b\003\b\020\030\000 82\0020\001:\0018B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\020\020\024\032\0020\0252\006\020\026\032\0020\027H\026J\020\020\030\032\0020\0252\006\020\026\032\0020\027H\026J\020\020\031\032\0020\r2\006\020\026\032\0020\027H\002J\020\020\032\032\0020\r2\006\020\026\032\0020\027H\002J\020\020\033\032\0020\r2\006\020\026\032\0020\027H\002J\020\020\034\032\0020\0352\006\020\026\032\0020\027H\002J \020\036\032\0020\0252\006\020\037\032\0020 2\006\020!\032\0020 2\006\020\"\032\0020#H\026J \020$\032\0020\0252\006\020\037\032\0020 2\006\020!\032\0020 2\006\020\"\032\0020#H\026J \020%\032\0020\0252\006\020\037\032\0020 2\006\020!\032\0020 2\006\020\"\032\0020#H\026J \020&\032\0020\0252\006\020\037\032\0020 2\006\020!\032\0020 2\006\020\"\032\0020#H\026J \020'\032\0020\0252\006\020\037\032\0020 2\006\020!\032\0020 2\006\020\"\032\0020(H\026J!\020)\032\0020\r2\022\020*\032\n\022\006\b\001\022\0020,0+\"\0020,H\002¢\006\002\020-J\020\020.\032\0020 2\006\020\"\032\0020#H\002J\030\020/\032\0020 2\006\020\"\032\0020#2\006\0200\032\0020 H\002J \0201\032\002022\006\0203\032\0020 2\006\020\037\032\0020 2\006\020!\032\0020 H\002J\020\0204\032\0020\0252\006\0205\032\00206H\002J\020\0204\032\0020\0252\006\0207\032\00202H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\rX\016¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\024\020\020\032\0020\0218BX\004¢\006\006\032\004\b\022\020\023¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalEventsHandler;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalEventsHandler;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)V", "getOutputModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "ignoreNextKeyTypedEvent", "", "lastMotionReport", "Ljava/awt/Point;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "keyTyped", "", "e", "Ljava/awt/event/KeyEvent;", "keyPressed", "processTerminalKeyPressed", "processCharacter", "isAltPressedOnly", "simpleMapKeyCodeToChar", "", "mousePressed", "x", "", "y", "event", "Ljava/awt/event/MouseEvent;", "mouseReleased", "mouseMoved", "mouseDragged", "mouseWheelMoved", "Ljava/awt/event/MouseWheelEvent;", "shouldSendMouseData", "eligibleModes", "", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "([Lcom/jediterm/terminal/emulator/mouse/MouseMode;)Z", "createButtonCode", "applyModifierKeys", "cb", "mouseReport", "", "button", "sendUserInput", "data", "", "bytes", "Companion", "ej-core"})
/*     */ public class SimpleTerminalEventsHandler
/*     */   implements TerminalEventsHandler
/*     */ {
/*     */   public SimpleTerminalEventsHandler(@NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalOutputModel outputModel) {
/*  31 */     this.session = session;
/*  32 */     this.settings = settings;
/*  33 */     this.outputModel = outputModel; } @NotNull protected final TerminalOutputModel getOutputModel() { return this.outputModel; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final TerminalModel getModel() {
/*  39 */     return this.session.getModel();
/*     */   }
/*     */   public void keyTyped(@NotNull KeyEvent e) {
/*  42 */     Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullExpressionValue(this.outputModel.getEditor().getSelectionModel(), "getSelectionModel(...)"); SelectionModel selectionModel = this.outputModel.getEditor().getSelectionModel();
/*  43 */     if (selectionModel.hasSelection()) {
/*  44 */       selectionModel.removeSelection();
/*     */     }
/*     */     
/*  47 */     if (this.ignoreNextKeyTypedEvent) {
/*  48 */       e.consume();
/*     */       return;
/*     */     } 
/*  51 */     if (!Character.isISOControl(e.getKeyChar())) {
/*     */       try {
/*  53 */         if (processCharacter(e)) {
/*  54 */           e.consume();
/*     */         }
/*     */       }
/*  57 */       catch (Exception ex) {
/*  58 */         LOG.error("Error sending typed key to emulator", ex);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void keyPressed(@NotNull KeyEvent e) {
/*  64 */     Intrinsics.checkNotNullParameter(e, "e"); this.ignoreNextKeyTypedEvent = false;
/*  65 */     if (processTerminalKeyPressed(e)) {
/*  66 */       e.consume();
/*  67 */       this.ignoreNextKeyTypedEvent = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final boolean processTerminalKeyPressed(KeyEvent e) {
/*     */     try {
/*  73 */       int keyCode = e.getKeyCode();
/*  74 */       char keyChar = e.getKeyChar();
/*     */ 
/*     */ 
/*     */       
/*  78 */       if (keyCode == 127 && keyChar == '.') {
/*  79 */         byte[] arrayOfByte = new byte[1]; arrayOfByte[0] = 46; sendUserInput(arrayOfByte);
/*  80 */         return true;
/*     */       } 
/*     */       
/*  83 */       if (keyChar == ' ' && (e.getModifiersEx() & 0x80) != 0) {
/*  84 */         byte[] arrayOfByte = new byte[1]; arrayOfByte[0] = 0; sendUserInput(arrayOfByte);
/*  85 */         return true;
/*     */       } 
/*  87 */       byte[] code = this.session.getController$ej_core().getCodeForKey(keyCode, e.getModifiers());
/*  88 */       if (code != null) {
/*  89 */         sendUserInput(code);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  94 */         return true;
/*     */       } 
/*  96 */       if (isAltPressedOnly(e) && Character.isDefined(keyChar) && this.settings.altSendsEscape()) {
/*     */ 
/*     */ 
/*     */         
/* 100 */         char[] arrayOfChar = new char[2]; arrayOfChar[0] = '\033'; arrayOfChar[1] = simpleMapKeyCodeToChar(e); arrayOfChar = arrayOfChar; String string = new String(arrayOfChar);
/* 101 */         sendUserInput(string);
/* 102 */         return true;
/*     */       } 
/* 104 */       if (Character.isISOControl(keyChar)) {
/* 105 */         return processCharacter(e);
/*     */       }
/*     */     }
/* 108 */     catch (Exception ex) {
/* 109 */       LOG.error("Error sending pressed key to emulator", ex);
/*     */     } 
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   private final boolean processCharacter(KeyEvent e) {
/* 115 */     if (isAltPressedOnly(e) && this.settings.altSendsEscape()) {
/* 116 */       return false;
/*     */     }
/* 118 */     char keyChar = e.getKeyChar();
/* 119 */     if (keyChar == '`' && (e.getModifiersEx() & 0x100) != 0)
/*     */     {
/* 121 */       return false;
/*     */     }
/* 123 */     sendUserInput(String.valueOf(keyChar));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     return true;
/*     */   }
/*     */   
/*     */   private final boolean isAltPressedOnly(KeyEvent e) {
/* 132 */     int modifiersEx = e.getModifiersEx();
/* 133 */     return ((modifiersEx & 0x200) != 0 && (
/* 134 */       modifiersEx & 0x2000) == 0 && (
/* 135 */       modifiersEx & 0x80) == 0 && (
/* 136 */       modifiersEx & 0x40) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   private final char simpleMapKeyCodeToChar(KeyEvent e) {
/* 141 */     char keyChar = (char)e.getKeyCode();
/* 142 */     return ((e.getModifiersEx() & 0x40) != 0) ? 
/* 143 */       Character.toUpperCase(keyChar) : 
/*     */       
/* 145 */       Character.toLowerCase(keyChar);
/*     */   }
/*     */   
/*     */   public void mousePressed(int x, int y, @NotNull MouseEvent event) {
/* 149 */     Intrinsics.checkNotNullParameter(event, "event"); MouseMode[] arrayOfMouseMode = new MouseMode[2]; arrayOfMouseMode[0] = MouseMode.MOUSE_REPORTING_NORMAL; arrayOfMouseMode[1] = MouseMode.MOUSE_REPORTING_BUTTON_MOTION; if (shouldSendMouseData(arrayOfMouseMode)) {
/* 150 */       int code = createButtonCode(event);
/* 151 */       if (code != -1) {
/* 152 */         int offset; switch (code) { case 4:
/*     */           case 5:
/* 154 */             offset = 4;
/* 155 */             code -= offset;
/* 156 */             code |= 0x40; break; }
/*     */         
/* 158 */         code = applyModifierKeys(event, code);
/* 159 */         sendUserInput(mouseReport(code, x + 1, y + 1));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void mouseReleased(int x, int y, @NotNull MouseEvent event) {
/* 165 */     Intrinsics.checkNotNullParameter(event, "event"); MouseMode[] arrayOfMouseMode = new MouseMode[2]; arrayOfMouseMode[0] = MouseMode.MOUSE_REPORTING_NORMAL; arrayOfMouseMode[1] = MouseMode.MOUSE_REPORTING_BUTTON_MOTION; if (shouldSendMouseData(arrayOfMouseMode)) {
/* 166 */       int code = createButtonCode(event);
/* 167 */       if (code != -1) {
/* 168 */         code = (getModel().getMouseFormat() == MouseFormat.MOUSE_FORMAT_SGR) ? (
/*     */           
/* 170 */           code | 0x80) : 
/*     */ 
/*     */ 
/*     */           
/* 174 */           3;
/*     */         
/* 176 */         code = applyModifierKeys(event, code);
/* 177 */         sendUserInput(mouseReport(code, x + 1, y + 1));
/*     */       } 
/*     */     } 
/* 180 */     this.lastMotionReport = null;
/*     */   }
/*     */   
/*     */   public void mouseMoved(int x, int y, @NotNull MouseEvent event) {
/* 184 */     Intrinsics.checkNotNullParameter(event, "event"); if (Intrinsics.areEqual(this.lastMotionReport, new Point(x, y))) {
/*     */       return;
/*     */     }
/* 187 */     MouseMode[] arrayOfMouseMode = new MouseMode[1]; arrayOfMouseMode[0] = MouseMode.MOUSE_REPORTING_ALL_MOTION; if (shouldSendMouseData(arrayOfMouseMode)) {
/* 188 */       sendUserInput(mouseReport(3, x + 1, y + 1));
/*     */     }
/* 190 */     this.lastMotionReport = new Point(x, y);
/*     */   }
/*     */   
/*     */   public void mouseDragged(int x, int y, @NotNull MouseEvent event) {
/* 194 */     Intrinsics.checkNotNullParameter(event, "event"); if (Intrinsics.areEqual(this.lastMotionReport, new Point(x, y))) {
/*     */       return;
/*     */     }
/* 197 */     MouseMode[] arrayOfMouseMode = new MouseMode[1]; arrayOfMouseMode[0] = MouseMode.MOUSE_REPORTING_BUTTON_MOTION; if (shouldSendMouseData(arrayOfMouseMode)) {
/*     */       
/* 199 */       int code = createButtonCode(event);
/* 200 */       if (code != -1) {
/* 201 */         code |= 0x20;
/* 202 */         code = applyModifierKeys(event, code);
/* 203 */         sendUserInput(mouseReport(code, x + 1, y + 1));
/*     */       } 
/*     */     } 
/* 206 */     this.lastMotionReport = new Point(x, y);
/*     */   }
/*     */   
/*     */   public void mouseWheelMoved(int x, int y, @NotNull MouseWheelEvent event) {
/* 210 */     Intrinsics.checkNotNullParameter(event, "event"); if (this.settings.enableMouseReporting() && getModel().getMouseMode() != MouseMode.MOUSE_REPORTING_NONE && !event.isShiftDown()) {
/* 211 */       this.outputModel.getEditor().getSelectionModel().removeSelection();
/*     */       
/* 213 */       mousePressed(x, y, event);
/*     */     } 
/* 215 */     if (getModel().getUseAlternateBuffer() && this.settings.sendArrowKeysInAlternativeMode()) {
/*     */       
/* 217 */       byte[] arrowKeys = (event.getWheelRotation() < 0) ? 
/* 218 */         this.session.getController$ej_core().getCodeForKey(38, 0) : 
/*     */ 
/*     */         
/* 221 */         this.session.getController$ej_core().getCodeForKey(40, 0);
/*     */       
/* 223 */       for (int i = 0, j = Math.abs(event.getUnitsToScroll()); i < j; i++) {
/* 224 */         Intrinsics.checkNotNull(arrowKeys); sendUserInput(arrowKeys);
/*     */       } 
/* 226 */       event.consume();
/*     */     } 
/*     */   }
/*     */   
/*     */   private final boolean shouldSendMouseData(MouseMode... eligibleModes) {
/* 231 */     switch (WhenMappings.$EnumSwitchMapping$0[getModel().getMouseMode().ordinal()]) { case 1: case 2:  }  return 
/*     */ 
/*     */       
/* 234 */       ArraysKt.contains((Object[])eligibleModes, getModel().getMouseMode());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int createButtonCode(MouseEvent event) {
/* 245 */     if (event instanceof MouseWheelEvent) {  }
/* 246 */     else { return -1; }
/*     */     
/*     */     return SwingUtilities.isLeftMouseButton(event) ? 0 : (SwingUtilities.isMiddleMouseButton(event) ? 1 : (SwingUtilities.isRightMouseButton(event) ? -1 : "JD-Core does not support Kotlin"));
/*     */   }
/*     */   private final int applyModifierKeys(MouseEvent event, int cb) {
/* 251 */     int code = cb;
/* 252 */     if (event.isControlDown()) {
/* 253 */       code |= 0x10;
/*     */     }
/* 255 */     if (event.isShiftDown()) {
/* 256 */       code |= 0x4;
/*     */     }
/* 258 */     if ((event.getModifiersEx() & 0x4) != 0) {
/* 259 */       code |= 0x8;
/*     */     }
/* 261 */     return code;
/*     */   }
/*     */   
/*     */   private final byte[] mouseReport(int button, int x, int y) {
/* 265 */     String charset = "UTF-8";
/* 266 */     switch (WhenMappings.$EnumSwitchMapping$1[getModel().getMouseFormat().ordinal()])
/*     */     { case 1:
/* 268 */         str2 = "\033[M%c%c%c"; arrayOfObject = new Object[3]; arrayOfObject[0] = Character.valueOf((char)(32 + button)); arrayOfObject[1] = Character.valueOf((char)(32 + x)); arrayOfObject[2] = Character.valueOf((char)(32 + y)); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)");
/*     */       
/*     */       case 2:
/* 271 */         str2 = "\033[%d;%d;%dM"; arrayOfObject = new Object[3]; arrayOfObject[0] = Integer.valueOf(32 + button); arrayOfObject[1] = Integer.valueOf(x); arrayOfObject[2] = Integer.valueOf(y); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)");
/*     */ 
/*     */ 
/*     */       
/*     */       case 3:
/* 276 */         str2 = "\033[<%d;%d;%dm";
/* 277 */         arrayOfObject = new Object[3]; arrayOfObject[0] = Integer.valueOf(button ^ 0x80); arrayOfObject[1] = 
/* 278 */           Integer.valueOf(x);
/* 279 */         arrayOfObject[2] = Integer.valueOf(y);
/*     */         
/*     */         arrayOfObject = arrayOfObject;
/*     */         Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)");
/* 283 */         str2 = "\033[<%d;%d;%dM"; arrayOfObject = new Object[3]; arrayOfObject[0] = Integer.valueOf(button); arrayOfObject[1] = Integer.valueOf(x); arrayOfObject[2] = Integer.valueOf(y); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); command = ((button & 0x80) != 0) ? String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)) : String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 294 */         LOG.debug("" + getModel().getMouseFormat() + " (" + getModel().getMouseFormat() + ") report : " + charset + ", " + button + "x" + x + " = " + y);
/* 295 */         str1 = command; Intrinsics.checkNotNullExpressionValue(Charset.forName(charset), "forName(...)"); Intrinsics.checkNotNullExpressionValue(str1.getBytes(Charset.forName(charset)), "getBytes(...)"); return str1.getBytes(Charset.forName(charset)); }  charset = "ISO-8859-1"; String str2 = "\033[M%c%c%c"; Object[] arrayOfObject = new Object[3]; arrayOfObject[0] = Character.valueOf((char)(32 + button)); arrayOfObject[1] = Character.valueOf((char)(32 + x)); arrayOfObject[2] = Character.valueOf((char)(32 + y)); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); String command = String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)); LOG.debug("" + getModel().getMouseFormat() + " (" + getModel().getMouseFormat() + ") report : " + charset + ", " + button + "x" + x + " = " + y); String str1 = command; Intrinsics.checkNotNullExpressionValue(Charset.forName(charset), "forName(...)"); Intrinsics.checkNotNullExpressionValue(str1.getBytes(Charset.forName(charset)), "getBytes(...)"); return str1.getBytes(Charset.forName(charset));
/*     */   }
/*     */   
/*     */   private final void sendUserInput(String data) {
/* 299 */     this.session.getTerminalOutputStream$ej_core().sendString(data, true);
/*     */   }
/*     */   
/*     */   private final void sendUserInput(byte[] bytes) {
/* 303 */     this.session.getTerminalOutputStream$ej_core().sendBytes(bytes, true);
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\023\020\004\032\0070\005¢\006\002\b\006X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalEventsHandler$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } @NotNull
/* 307 */   public static final Companion Companion = new Companion(null); @NotNull private final BlockTerminalSession session; @NotNull private final JBTerminalSystemSettingsProviderBase settings; @NotNull private final TerminalOutputModel outputModel; private boolean ignoreNextKeyTypedEvent; @Nullable private Point lastMotionReport; @NotNull private static final Logger LOG = Logger.getInstance(SimpleTerminalEventsHandler.class); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance(SimpleTerminalEventsHandler.class), "getInstance(...)"); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\SimpleTerminalEventsHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */