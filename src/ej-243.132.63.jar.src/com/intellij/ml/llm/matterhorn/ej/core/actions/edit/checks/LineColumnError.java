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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\030\0002\0020\001B'\022\n\020\002\032\0060\003j\002`\004\022\n\020\005\032\0060\003j\002`\004\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\r\032\0020\007H\026J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\003H\026J\024\020\023\032\0060\003j\002`\0042\006\020\024\032\0020\025H\026R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\n\020\013R\025\020\005\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\f\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "line", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "column", "error", "", "<init>", "(IILjava/lang/String;)V", "getLine", "()I", "getColumn", "toString", "equals", "", "other", "", "hashCode", "getStartLineOneBasedIndex", "document", "Lcom/intellij/openapi/editor/Document;", "ej-core"})
/*    */ public final class LineColumnError
/*    */   extends Error
/*    */ {
/*    */   private final int line;
/*    */   private final int column;
/*    */   
/*    */   public LineColumnError(int line, int column, @NotNull String error) {
/* 48 */     super(error, (DefaultConstructorMarker)null); this.line = line; this.column = column; } public final int getLine() { return this.line; } public final int getColumn() { return this.column; }
/*    */    @NotNull
/*    */   public String toString() {
/* 51 */     return "LineColumnError(line=" + this.line + ", column=" + this.column + ", text=" + getText() + ")";
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 55 */     if (this == other) return true; 
/* 56 */     if (!(other instanceof LineColumnError)) return false;
/*    */     
/* 58 */     if (this.line != ((LineColumnError)other).line) return false; 
/* 59 */     if (this.column != ((LineColumnError)other).column) return false; 
/* 60 */     if (!Intrinsics.areEqual(getText(), ((LineColumnError)other).getText())) return false;
/*    */     
/* 62 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 66 */     int result = super.hashCode();
/* 67 */     result = 31 * result + Integer.hashCode(this.line);
/* 68 */     result = 31 * result + Integer.hashCode(this.column);
/* 69 */     result = 31 * result + getText().hashCode();
/* 70 */     return result;
/*    */   }
/*    */   public int getStartLineOneBasedIndex(@NotNull Document document) {
/* 73 */     Intrinsics.checkNotNullParameter(document, "document"); return this.line;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\LineColumnError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */