/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0212\0020\001:\001\021B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\006\032\0020\0072\b\020\b\032\004\030\0010\001HÖ\003¢\006\004\b\t\020\nJ\020\020\013\032\0020\003HÖ\001¢\006\004\b\f\020\005J\017\020\r\032\0020\016H\026¢\006\004\b\017\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\022"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*     */ public final class ImeAction
/*     */ {
/*     */   public static final boolean equals-impl0(int p1, int p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */   
/*     */   private static int constructor-impl(int value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*  28 */     return toString-impl(this.value);
/*  29 */   } public static boolean equals-impl(int arg0, Object other) { if (!(other instanceof ImeAction)) return false;  int i = ((ImeAction)other).unbox-impl(); return !(arg0 != i); } public int hashCode() { return hashCode-impl(this.value); } public static int hashCode-impl(int arg0) { return Integer.hashCode(arg0); } @NotNull public static String toString-impl(int arg0) { int i = arg0; return 
/*  30 */       equals-impl0(i, Unspecified) ? "Unspecified" : (
/*  31 */       equals-impl0(i, None) ? "None" : (
/*  32 */       equals-impl0(i, Default) ? "Default" : (
/*  33 */       equals-impl0(i, Go) ? "Go" : (
/*  34 */       equals-impl0(i, Search) ? "Search" : (
/*  35 */       equals-impl0(i, Send) ? "Send" : (
/*  36 */       equals-impl0(i, Previous) ? "Previous" : (
/*  37 */       equals-impl0(i, Next) ? "Next" : (
/*  38 */       equals-impl0(i, Done) ? "Done" : 
/*  39 */       "Invalid")))))))); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\035\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007R$\020\017\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\020\020\002\032\004\b\021\020\007R$\020\022\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\023\020\002\032\004\b\024\020\007R$\020\025\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\026\020\002\032\004\b\027\020\007R$\020\030\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\031\020\002\032\004\b\032\020\007R$\020\033\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\034\020\002\032\004\b\035\020\007R$\020\036\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\037\020\002\032\004\b \020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeAction;", "getDefault-eUduSuo$annotations", "getDefault-eUduSuo", "()I", "I", "Done", "getDone-eUduSuo$annotations", "getDone-eUduSuo", "Go", "getGo-eUduSuo$annotations", "getGo-eUduSuo", "Next", "getNext-eUduSuo$annotations", "getNext-eUduSuo", "None", "getNone-eUduSuo$annotations", "getNone-eUduSuo", "Previous", "getPrevious-eUduSuo$annotations", "getPrevious-eUduSuo", "Search", "getSearch-eUduSuo$annotations", "getSearch-eUduSuo", "Send", "getSend-eUduSuo$annotations", "getSend-eUduSuo", "Unspecified", "getUnspecified-eUduSuo$annotations", "getUnspecified-eUduSuo", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */     
/*     */     public final int getUnspecified-eUduSuo() {
/*  50 */       return ImeAction.Unspecified;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getDefault-eUduSuo() {
/*  59 */       return ImeAction.Default;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getNone-eUduSuo() {
/*  67 */       return ImeAction.None;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getGo-eUduSuo() {
/*  74 */       return ImeAction.Go;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getSearch-eUduSuo() {
/*  80 */       return ImeAction.Search;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getSend-eUduSuo() {
/*  86 */       return ImeAction.Send;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getPrevious-eUduSuo() {
/*  93 */       return ImeAction.Previous;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getNext-eUduSuo() {
/* 100 */       return ImeAction.Next;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getDone-eUduSuo()
/*     */     {
/* 108 */       return ImeAction.Done; } } @NotNull public static final Companion Companion = new Companion(null); private final int value; private static final int Unspecified = constructor-impl(-1); private static final int Default = constructor-impl(1); private static final int None = constructor-impl(0); private static final int Done = constructor-impl(7);
/*     */   private static final int Go = constructor-impl(2);
/*     */   private static final int Search = constructor-impl(3);
/*     */   private static final int Send = constructor-impl(4);
/*     */   private static final int Previous = constructor-impl(5);
/*     */   private static final int Next = constructor-impl(6);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\ImeAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */