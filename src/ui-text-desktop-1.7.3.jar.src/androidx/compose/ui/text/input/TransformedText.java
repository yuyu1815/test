/*    */ package androidx.compose.ui.text.input;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.AnnotatedString;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\001H\002J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\022"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/input/OffsetMapping;)V", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class TransformedText
/*    */ {
/*    */   @NotNull
/*    */   private final AnnotatedString text;
/*    */   @NotNull
/*    */   private final OffsetMapping offsetMapping;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public TransformedText(@NotNull AnnotatedString text, @NotNull OffsetMapping offsetMapping) {
/* 30 */     this.text = text;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.offsetMapping = offsetMapping; } @NotNull public final OffsetMapping getOffsetMapping() { return this.offsetMapping; }
/*    */   @NotNull
/*    */   public final AnnotatedString getText() { return this.text; } public boolean equals(@Nullable Object other) {
/* 38 */     if (this == other) return true; 
/* 39 */     if (!(other instanceof TransformedText)) return false; 
/* 40 */     if (!Intrinsics.areEqual(this.text, ((TransformedText)other).text)) return false; 
/* 41 */     if (!Intrinsics.areEqual(this.offsetMapping, ((TransformedText)other).offsetMapping)) return false; 
/* 42 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 46 */     int result = this.text.hashCode();
/* 47 */     result = 31 * result + this.offsetMapping.hashCode();
/* 48 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 52 */     return "TransformedText(text=" + this.text + ", offsetMapping=" + this.offsetMapping + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\TransformedText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */