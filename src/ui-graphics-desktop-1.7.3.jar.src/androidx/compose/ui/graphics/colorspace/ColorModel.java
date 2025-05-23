/*    */ package androidx.compose.ui.graphics.colorspace;
/*    */ 
/*    */ import androidx.annotation.IntRange;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\004\b@\030\000 \0272\0020\001:\001\027B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003¢\006\004\b\017\020\020J\020\020\021\032\0020\007HÖ\001¢\006\004\b\022\020\013J\017\020\023\032\0020\024H\026¢\006\004\b\025\020\026R\032\020\006\032\0020\0078GX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\002\001\0020\003¨\006\030"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "packedValue", "", "constructor-impl", "(J)J", "componentCount", "", "getComponentCount$annotations", "()V", "getComponentCount-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics"})
/*    */ @Immutable
/*    */ @SourceDebugExtension({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n107#2:92\n100#2:93\n100#2:94\n100#2:95\n100#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
/*    */ public final class ColorModel
/*    */ {
/*    */   @IntRange(from = 1L, to = 4L)
/*    */   public static final int getComponentCount-impl(long arg0) {
/* 49 */     long value$iv = arg0; int $i$f$unpackInt1 = 0; return 
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
/* 92 */       (int)(value$iv >> 32L); } static { byte b = 3; int val2$iv = 0, $i$f$packInts = 0;
/* 93 */     Rgb = constructor-impl(b << 32L | val2$iv & 0xFFFFFFFFL); int val1$iv = 3; val2$iv = 1; $i$f$packInts = 0;
/* 94 */     Xyz = constructor-impl(val1$iv << 32L | val2$iv & 0xFFFFFFFFL); val1$iv = 3; val2$iv = 2; $i$f$packInts = 0;
/* 95 */     Lab = constructor-impl(val1$iv << 32L | val2$iv & 0xFFFFFFFFL); val1$iv = 4; val2$iv = 3; $i$f$packInts = 0;
/* 96 */     Cmyk = constructor-impl(val1$iv << 32L | val2$iv & 0xFFFFFFFFL); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\031\020\n\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\013\020\006R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", "J", "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     public final long getRgb-xdoWZVw() {
/*    */       return ColorModel.Rgb;
/*    */     }
/*    */     
/*    */     public final long getXyz-xdoWZVw() {
/*    */       return ColorModel.Xyz;
/*    */     }
/*    */     
/*    */     public final long getLab-xdoWZVw() {
/*    */       return ColorModel.Lab;
/*    */     }
/*    */     
/*    */     public final long getCmyk-xdoWZVw() {
/*    */       return ColorModel.Cmyk;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long packedValue;
/*    */   private static final long Rgb;
/*    */   private static final long Xyz;
/*    */   private static final long Lab;
/*    */   private static final long Cmyk;
/*    */   
/*    */   @NotNull
/*    */   public static String toString-impl(long arg0) {
/*    */     long l = arg0;
/*    */     return equals-impl0(l, Rgb) ? "Rgb" : (equals-impl0(l, Xyz) ? "Xyz" : (equals-impl0(l, Lab) ? "Lab" : (equals-impl0(l, Cmyk) ? "Cmyk" : "Unknown")));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return toString-impl(this.packedValue);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(long arg0) {
/*    */     return Long.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.packedValue);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(long arg0, Object other) {
/*    */     if (!(other instanceof ColorModel))
/*    */       return false; 
/*    */     long l = ((ColorModel)other).unbox-impl();
/*    */     return !(arg0 != l);
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.packedValue, other);
/*    */   }
/*    */   
/*    */   public static long constructor-impl(long packedValue) {
/*    */     return packedValue;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(long p1, long p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\ColorModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */