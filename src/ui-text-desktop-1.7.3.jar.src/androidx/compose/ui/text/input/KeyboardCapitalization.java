/*    */ package androidx.compose.ui.text.input;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class KeyboardCapitalization
/*    */ {
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */   
/*    */   private static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 28 */     return toString-impl(this.value);
/* 29 */   } public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof KeyboardCapitalization)) return false;  int i = ((KeyboardCapitalization)other).unbox-impl(); return !(arg0 != i); } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/* 30 */       equals-impl0(i, Unspecified) ? "Unspecified" : (
/* 31 */       equals-impl0(i, None) ? "None" : (
/* 32 */       equals-impl0(i, Characters) ? "Characters" : (
/* 33 */       equals-impl0(i, Words) ? "Words" : (
/* 34 */       equals-impl0(i, Sentences) ? "Sentences" : 
/* 35 */       "Invalid")))); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\021\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007R$\020\017\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\020\020\002\032\004\b\021\020\007R$\020\022\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\023\020\002\032\004\b\024\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;", "", "()V", "Characters", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCharacters-IUNYP9k$annotations", "getCharacters-IUNYP9k", "()I", "I", "None", "getNone-IUNYP9k$annotations", "getNone-IUNYP9k", "Sentences", "getSentences-IUNYP9k$annotations", "getSentences-IUNYP9k", "Unspecified", "getUnspecified-IUNYP9k$annotations", "getUnspecified-IUNYP9k", "Words", "getWords-IUNYP9k$annotations", "getWords-IUNYP9k", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     public final int getUnspecified-IUNYP9k() {
/* 44 */       return KeyboardCapitalization.Unspecified;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getNone-IUNYP9k() {
/* 50 */       return KeyboardCapitalization.None;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getCharacters-IUNYP9k() {
/* 56 */       return KeyboardCapitalization.Characters;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public final int getWords-IUNYP9k() {
/* 62 */       return KeyboardCapitalization.Words;
/*    */     }
/*    */ 
/*    */     
/*    */     public final int getSentences-IUNYP9k()
/*    */     {
/* 68 */       return KeyboardCapitalization.Sentences; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Unspecified = constructor-impl(-1); private static final int None = constructor-impl(0); private static final int Characters = constructor-impl(1); private static final int Words = constructor-impl(2); private static final int Sentences = constructor-impl(3);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\KeyboardCapitalization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */