/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\017\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B)\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bB\031\b\026\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\004\b\007\020\rB\021\b\002\022\006\020\016\032\0020\n¢\006\004\b\007\020\017J;\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\003ø\001\001ø\001\000¢\006\004\b\027\020\030J\032\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003¢\006\004\b\034\020\035J\020\020\036\032\0020\003HÖ\001¢\006\004\b\037\020\021J\025\020 \032\0020\0032\006\020\013\032\0020\f¢\006\004\b!\020\"J\025\020#\032\0020\0032\006\020\013\032\0020\f¢\006\004\b$\020\"J\023\020%\032\0020\000ø\001\001ø\001\000¢\006\004\b&\020\017J\033\020'\032\0020\n2\006\020\013\032\0020\fø\001\001ø\001\000¢\006\004\b(\020\rJ\020\020)\032\0020*HÖ\001¢\006\004\b+\020,R\022\020\006\032\0020\0038Æ\002¢\006\006\032\004\b\020\020\021R\022\020\005\032\0020\0038Æ\002¢\006\006\032\004\b\022\020\021R\022\020\004\032\0020\0038Æ\002¢\006\006\032\004\b\023\020\021R\022\020\002\032\0020\0038Æ\002¢\006\006\032\004\b\024\020\021R\026\020\016\032\0020\nX\004ø\001\000ø\001\001¢\006\004\n\002\020\025\001\016\001\0020\n\002\013\n\005\b¡\0360\001\n\002\b!¨\006-"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "mainAxisMin", "", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "c", "Landroidx/compose/ui/unit/Constraints;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "(J)J", "getCrossAxisMax-impl", "(J)I", "getCrossAxisMin-impl", "getMainAxisMax-impl", "getMainAxisMin-impl", "J", "copy", "copy-yUG9Ft0", "(JIIII)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "maxHeight", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxWidth-impl", "stretchCrossAxis", "stretchCrossAxis-q4ezo7Y", "toBoxConstraints", "toBoxConstraints-OenEA2s", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,723:1\n229#1:724\n230#1:725\n232#1:726\n231#1:727\n232#1:728\n229#1,4:729\n231#1,2:733\n229#1,2:735\n230#1:737\n232#1:738\n232#1:739\n230#1:740\n229#1:741\n230#1:742\n231#1:743\n232#1:744\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n257#1:724\n258#1:725\n259#1:726\n259#1:727\n260#1:728\n266#1:729,4\n268#1:733,2\n268#1:735,2\n274#1:737\n276#1:738\n282#1:739\n284#1:740\n288#1:741\n289#1:742\n290#1:743\n291#1:744\n*E\n"})
/*     */ public final class OrientationIndependentConstraints
/*     */ {
/*     */   private final long value;
/*     */   
/*     */   public static final int getMainAxisMin-impl(long arg0) {
/* 229 */     int $i$f$getMainAxisMin-impl = 0; return Constraints.getMinWidth-impl(arg0);
/* 230 */   } public static final int getMainAxisMax-impl(long arg0) { int $i$f$getMainAxisMax-impl = 0; return Constraints.getMaxWidth-impl(arg0); }
/* 231 */   public static final int getCrossAxisMin-impl(long arg0) { int $i$f$getCrossAxisMin-impl = 0; return Constraints.getMinHeight-impl(arg0); } public static final int getCrossAxisMax-impl(long arg0) {
/* 232 */     int $i$f$getCrossAxisMax-impl = 0; return Constraints.getMaxHeight-impl(arg0);
/*     */   } public static long constructor-impl(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
/* 234 */     return 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 239 */       constructor-impl(
/* 240 */         ConstraintsKt.Constraints(
/* 241 */           mainAxisMin, 
/* 242 */           mainAxisMax, 
/* 243 */           crossAxisMin, 
/* 244 */           crossAxisMax));
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long c, @NotNull LayoutOrientation orientation) {
/* 248 */     Intrinsics.checkNotNullParameter(orientation, "orientation"); return constructor-impl(
/* 249 */         (orientation == LayoutOrientation.Horizontal) ? Constraints.getMinWidth-impl(c) : Constraints.getMinHeight-impl(c), 
/* 250 */         (orientation == LayoutOrientation.Horizontal) ? Constraints.getMaxWidth-impl(c) : Constraints.getMaxHeight-impl(c), 
/* 251 */         (orientation == LayoutOrientation.Horizontal) ? Constraints.getMinHeight-impl(c) : Constraints.getMinWidth-impl(c), 
/* 252 */         (orientation == LayoutOrientation.Horizontal) ? Constraints.getMaxHeight-impl(c) : Constraints.getMaxWidth-impl(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final long stretchCrossAxis-q4ezo7Y(long arg0) {
/* 257 */     int $i$f$getMainAxisMin-impl = 0;
/* 258 */     int $i$f$getMainAxisMax-impl = 0;
/* 259 */     int i = 0; i = 0; int $i$f$getCrossAxisMin-impl = 0;
/* 260 */     int $i$f$getCrossAxisMax-impl = 0;
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
/* 724 */     return constructor-impl(Constraints.getMinWidth-impl(arg0), 
/* 725 */         Constraints.getMaxWidth-impl(arg0), (
/* 726 */         Constraints.getMaxHeight-impl(arg0) != Integer.MAX_VALUE) ? Constraints.getMaxHeight-impl(arg0) : 
/* 727 */         Constraints.getMinHeight-impl(arg0), 
/* 728 */         Constraints.getMaxHeight-impl(arg0)); } public static final long toBoxConstraints-OenEA2s(long arg0, @NotNull LayoutOrientation orientation) { Intrinsics.checkNotNullParameter(orientation, "orientation"); int m = 0, k = 0, j = 0, i = 0; int $i$f$getCrossAxisMin-impl = 0, $i$f$getCrossAxisMax-impl = 0, $i$f$getMainAxisMin-impl = 0, $i$f$getMainAxisMax-impl = 0;
/* 729 */     return (orientation == LayoutOrientation.Horizontal) ? ConstraintsKt.Constraints(Constraints.getMinWidth-impl(arg0), 
/* 730 */         Constraints.getMaxWidth-impl(arg0), 
/* 731 */         Constraints.getMinHeight-impl(arg0), 
/* 732 */         Constraints.getMaxHeight-impl(arg0)) : ConstraintsKt.Constraints(
/* 733 */         Constraints.getMinHeight-impl(arg0), 
/* 734 */         Constraints.getMaxHeight-impl(arg0), 
/* 735 */         Constraints.getMinWidth-impl(arg0), 
/* 736 */         Constraints.getMaxWidth-impl(arg0)); } public static final int maxWidth-impl(long arg0, @NotNull LayoutOrientation orientation) { Intrinsics.checkNotNullParameter(orientation, "orientation"); int $i$f$getMainAxisMax-impl = 0; int $i$f$getCrossAxisMax-impl = 0;
/* 737 */     return (orientation == LayoutOrientation.Horizontal) ? Constraints.getMaxWidth-impl(arg0) : 
/* 738 */       Constraints.getMaxHeight-impl(arg0); } public static final int maxHeight-impl(long arg0, @NotNull LayoutOrientation orientation) { Intrinsics.checkNotNullParameter(orientation, "orientation"); int $i$f$getCrossAxisMax-impl = 0; int $i$f$getMainAxisMax-impl = 0;
/* 739 */     return (orientation == LayoutOrientation.Horizontal) ? Constraints.getMaxHeight-impl(arg0) : 
/* 740 */       Constraints.getMaxWidth-impl(arg0); }
/*     */ 
/*     */   
/*     */   public static final long copy-yUG9Ft0(long arg0, int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
/*     */     return constructor-impl(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
/*     */   }
/*     */   
/*     */   public static String toString-impl(long arg0) {
/*     */     return "OrientationIndependentConstraints(value=" + Constraints.toString-impl(arg0) + ')';
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return toString-impl(this.value);
/*     */   }
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return Constraints.hashCode-impl(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof OrientationIndependentConstraints))
/*     */       return false; 
/*     */     long l = ((OrientationIndependentConstraints)other).unbox-impl();
/*     */     return !!Constraints.equals-impl0(arg0, l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   private static long constructor-impl(long value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return Constraints.equals-impl0(p1, p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OrientationIndependentConstraints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */