/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\021\b\007\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\b\032\0020\t2\b\020\n\032\004\030\0010\001HÖ\003¢\006\004\b\013\020\fJ\020\020\r\032\0020\003HÖ\001¢\006\004\b\016\020\005J\017\020\017\032\0020\020H\026¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\024"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text"})
/*    */ public final class FontStyle
/*    */ {
/*    */   public final int getValue() {
/* 30 */     return this.value;
/*    */   } @NotNull
/* 32 */   public String toString() { return toString-impl(this.value); } @NotNull
/* 33 */   public static String toString-impl(int arg0) { int i = arg0; return 
/* 34 */       equals-impl0(i, Normal) ? "Normal" : (
/* 35 */       equals-impl0(i, Italic) ? "Italic" : 
/* 36 */       "Invalid"); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\f\020\f\032\b\022\004\022\0020\0040\rR\037\020\003\032\0020\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R\037\020\t\032\0020\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "()V", "Italic", "Landroidx/compose/ui/text/font/FontStyle;", "getItalic-_-LCdwA$annotations", "getItalic-_-LCdwA", "()I", "I", "Normal", "getNormal-_-LCdwA$annotations", "getNormal-_-LCdwA", "values", "", "ui-text"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final int getNormal-_-LCdwA() {
/* 43 */       return FontStyle.Normal;
/*    */     }
/*    */     
/*    */     public final int getItalic-_-LCdwA() {
/* 47 */       return FontStyle.Italic;
/*    */     } @NotNull
/*    */     public final List<FontStyle> values() {
/* 50 */       FontStyle[] arrayOfFontStyle = new FontStyle[2]; arrayOfFontStyle[0] = FontStyle.box-impl(getNormal-_-LCdwA()); arrayOfFontStyle[1] = FontStyle.box-impl(getItalic-_-LCdwA()); return CollectionsKt.listOf((Object[])arrayOfFontStyle);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int value;
/*    */   private static final int Normal = constructor-impl(0);
/*    */   private static final int Italic = constructor-impl(1);
/*    */   
/*    */   public static int hashCode-impl(int arg0) {
/*    */     return Integer.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.value);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(int arg0, Object other) {
/*    */     if (!(other instanceof FontStyle))
/*    */       return false; 
/*    */     int i = ((FontStyle)other).unbox-impl();
/*    */     return !(arg0 != i);
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
/*    */   public static int constructor-impl(int value) {
/*    */     return value;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(int p1, int p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */