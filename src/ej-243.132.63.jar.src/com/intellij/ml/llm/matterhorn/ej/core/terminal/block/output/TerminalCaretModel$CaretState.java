/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\013\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\033\022\b\020\002\032\004\030\0010\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\013\020\013\032\004\030\0010\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\037\020\r\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0052\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "", "position", "Lcom/intellij/openapi/editor/LogicalPosition;", "isBlinking", "", "<init>", "(Lcom/intellij/openapi/editor/LogicalPosition;Z)V", "getPosition", "()Lcom/intellij/openapi/editor/LogicalPosition;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*     */ public final class CaretState
/*     */ {
/*     */   @Nullable
/*     */   private final LogicalPosition position;
/*     */   private final boolean isBlinking;
/*     */   
/*     */   public CaretState(@Nullable LogicalPosition position, boolean isBlinking) {
/* 122 */     this.position = position; this.isBlinking = isBlinking; } @Nullable public final LogicalPosition getPosition() { return this.position; } public final boolean isBlinking() { return this.isBlinking; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final LogicalPosition component1() {
/*     */     return this.position;
/*     */   }
/*     */   
/*     */   public final boolean component2() {
/*     */     return this.isBlinking;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CaretState copy(@Nullable LogicalPosition position, boolean isBlinking) {
/*     */     return new CaretState(position, isBlinking);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "CaretState(position=" + this.position + ", isBlinking=" + this.isBlinking + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.position == null) ? 0 : this.position.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.isBlinking);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof CaretState))
/*     */       return false; 
/*     */     CaretState caretState = (CaretState)other;
/*     */     return !Intrinsics.areEqual(this.position, caretState.position) ? false : (!(this.isBlinking != caretState.isBlinking));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalCaretModel$CaretState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */