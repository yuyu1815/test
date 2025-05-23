/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\030\0002\0020\001B\033\022\n\020\002\032\0060\003j\002`\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\013\032\0020\006H\026J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017H\002J\b\020\020\032\0020\003H\026J\020\020\021\032\0020\0032\006\020\022\032\0020\023H\026R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "offset", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/ZeroBasedIndex;", "error", "", "<init>", "(ILjava/lang/String;)V", "getOffset", "()I", "toString", "equals", "", "other", "", "hashCode", "getStartLineOneBasedIndex", "document", "Lcom/intellij/openapi/editor/Document;", "ej-core"})
/*    */ public final class OffsetError
/*    */   extends Error
/*    */ {
/*    */   private final int offset;
/*    */   
/*    */   public OffsetError(int offset, @NotNull String error) {
/* 76 */     super(error, (DefaultConstructorMarker)null); this.offset = offset; } public final int getOffset() { return this.offset; }
/*    */    @NotNull
/*    */   public String toString() {
/* 79 */     return "OffsetError(offset=" + this.offset + ", text=" + getText() + ")";
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 83 */     if (this == other) return true; 
/* 84 */     if (!(other instanceof OffsetError)) return false;
/*    */     
/* 86 */     if (this.offset != ((OffsetError)other).offset) return false; 
/* 87 */     if (!Intrinsics.areEqual(getText(), ((OffsetError)other).getText())) return false;
/*    */     
/* 89 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 93 */     int result = super.hashCode();
/* 94 */     result = 31 * result + Integer.hashCode(this.offset);
/* 95 */     result = 31 * result + getText().hashCode();
/* 96 */     return result;
/*    */   }
/*    */   public int getStartLineOneBasedIndex(@NotNull Document document) {
/* 99 */     Intrinsics.checkNotNullParameter(document, "document"); return document.getLineNumber(this.offset) + 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\OffsetError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */