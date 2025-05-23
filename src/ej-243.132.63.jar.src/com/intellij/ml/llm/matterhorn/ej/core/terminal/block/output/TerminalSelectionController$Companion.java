/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.util.SystemInfo;
/*     */ import java.awt.event.MouseEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\030\020\t\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\t\020\fR\030\020\r\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\r\020\fR\030\020\016\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\016\020\fR\030\020\017\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\017\020\f¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "isSelectBlockRange", "", "Ljava/awt/event/MouseEvent;", "(Ljava/awt/event/MouseEvent;)Z", "isSelectAdditionalBlock", "isOnlyMetaDown", "isOnlyControlDown", "ej-core"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final DataKey<TerminalSelectionController> getKEY() {
/* 206 */     return TerminalSelectionController.access$getKEY$cp();
/*     */   }
/*     */   private final boolean isSelectBlockRange(MouseEvent $this$isSelectBlockRange) {
/* 209 */     return ($this$isSelectBlockRange.isShiftDown() && !$this$isSelectBlockRange.isControlDown() && !$this$isSelectBlockRange.isAltDown() && !$this$isSelectBlockRange.isMetaDown());
/*     */   }
/*     */   private final boolean isSelectAdditionalBlock(MouseEvent $this$isSelectAdditionalBlock) {
/* 212 */     return SystemInfo.isMac ? isOnlyMetaDown($this$isSelectAdditionalBlock) : isOnlyControlDown($this$isSelectAdditionalBlock);
/*     */   }
/*     */   private final boolean isOnlyMetaDown(MouseEvent $this$isOnlyMetaDown) {
/* 215 */     return ($this$isOnlyMetaDown.isMetaDown() && !$this$isOnlyMetaDown.isControlDown() && !$this$isOnlyMetaDown.isAltDown() && !$this$isOnlyMetaDown.isShiftDown());
/*     */   }
/*     */   private final boolean isOnlyControlDown(MouseEvent $this$isOnlyControlDown) {
/* 218 */     return ($this$isOnlyControlDown.isControlDown() && !$this$isOnlyControlDown.isAltDown() && !$this$isOnlyControlDown.isShiftDown() && !$this$isOnlyControlDown.isMetaDown());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionController$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */