/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J'\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\t¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "", "fileName", "", "originalText", "replacementText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getOriginalText", "getReplacementText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*    */ public final class Edit
/*    */ {
/*    */   @NotNull
/*    */   private final String fileName;
/*    */   @NotNull
/*    */   private final String originalText;
/*    */   @NotNull
/*    */   private final String replacementText;
/*    */   
/*    */   public Edit(@NotNull String fileName, @NotNull String originalText, @NotNull String replacementText) {
/* 35 */     this.fileName = fileName;
/* 36 */     this.originalText = originalText;
/* 37 */     this.replacementText = replacementText; } @NotNull public final String getReplacementText() { return this.replacementText; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getFileName() {
/*    */     return this.fileName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getOriginalText() {
/*    */     return this.originalText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.fileName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.originalText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.replacementText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Edit copy(@NotNull String fileName, @NotNull String originalText, @NotNull String replacementText) {
/*    */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*    */     Intrinsics.checkNotNullParameter(originalText, "originalText");
/*    */     Intrinsics.checkNotNullParameter(replacementText, "replacementText");
/*    */     return new Edit(fileName, originalText, replacementText);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Edit(fileName=" + this.fileName + ", originalText=" + this.originalText + ", replacementText=" + this.replacementText + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.fileName.hashCode();
/*    */     result = result * 31 + this.originalText.hashCode();
/*    */     return result * 31 + this.replacementText.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Edit))
/*    */       return false; 
/*    */     Edit edit = (Edit)other;
/*    */     return !Intrinsics.areEqual(this.fileName, edit.fileName) ? false : (!Intrinsics.areEqual(this.originalText, edit.originalText) ? false : (!!Intrinsics.areEqual(this.replacementText, edit.replacementText)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\Edit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */