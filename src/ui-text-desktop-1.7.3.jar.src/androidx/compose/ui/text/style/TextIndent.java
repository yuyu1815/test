/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.unit.TextUnit;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 \0242\0020\001:\001\024B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005J$\020\n\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003ø\001\000¢\006\004\b\013\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001H\002J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\b\032\004\b\006\020\007R\031\020\004\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\b\032\004\b\t\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "firstLine", "Landroidx/compose/ui/unit/TextUnit;", "restLine", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFirstLine-XSAIIZE", "()J", "J", "getRestLine-XSAIIZE", "copy", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public final class TextIndent
/*    */ {
/*    */   public final long getFirstLine-XSAIIZE() {
/*    */     return this.firstLine;
/*    */   }
/*    */   
/*    */   private TextIndent(long firstLine, long restLine) {
/* 33 */     this.firstLine = firstLine;
/* 34 */     this.restLine = restLine; } public final long getRestLine-XSAIIZE() { return this.restLine; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/* 41 */     public final TextIndent getNone() { return TextIndent.None; } } @NotNull public static final Companion Companion = new Companion(null); private final long firstLine; private final long restLine; public static final int $stable; @NotNull private static final TextIndent None = new TextIndent(0L, 0L, 3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextIndent copy-NB67dxo(long firstLine, long restLine) {
/* 48 */     return new TextIndent(firstLine, restLine, null);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 52 */     if (this == other) return true; 
/* 53 */     if (!(other instanceof TextIndent)) return false; 
/* 54 */     if (!TextUnit.equals-impl0(this.firstLine, ((TextIndent)other).firstLine)) return false; 
/* 55 */     if (!TextUnit.equals-impl0(this.restLine, ((TextIndent)other).restLine)) return false; 
/* 56 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 60 */     int result = TextUnit.hashCode-impl(this.firstLine);
/* 61 */     result = 31 * result + TextUnit.hashCode-impl(this.restLine);
/* 62 */     return result;
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 66 */     return "TextIndent(firstLine=" + TextUnit.toString-impl(this.firstLine) + ", restLine=" + TextUnit.toString-impl(this.restLine) + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextIndent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */