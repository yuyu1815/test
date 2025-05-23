/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpaces;
/*     */ import androidx.compose.ui.graphics.colorspace.Connector;
/*     */ import androidx.compose.ui.graphics.colorspace.Rgb;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.UnsignedKt;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\b\n\002\030\002\n\002\b\035\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\004\b@\030\000 :2\0020\001:\001:B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\035\032\0020\007H\n¢\006\004\b\036\020\013J\020\020\037\032\0020\007H\n¢\006\004\b \020\013J\020\020!\032\0020\007H\n¢\006\004\b\"\020\013J\020\020#\032\0020\007H\n¢\006\004\b$\020\013J\020\020%\032\0020\020H\n¢\006\004\b&\020\023J\033\020'\032\0020\0002\006\020\017\032\0020\020ø\001\001ø\001\000¢\006\004\b(\020)J=\020*\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\027\032\0020\0072\b\b\002\020\024\032\0020\0072\b\b\002\020\f\032\0020\007H\007ø\001\001ø\001\000¢\006\004\b+\020,J\032\020-\032\0020.2\b\020/\032\004\030\0010\001HÖ\003¢\006\004\b0\0201J\020\0202\032\00203HÖ\001¢\006\004\b4\0205J\017\0206\032\00207H\026¢\006\004\b8\0209R\032\020\006\032\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\032\020\f\032\0020\0078FX\004¢\006\f\022\004\b\r\020\t\032\004\b\016\020\013R\032\020\017\032\0020\0208FX\004¢\006\f\022\004\b\021\020\t\032\004\b\022\020\023R\032\020\024\032\0020\0078FX\004¢\006\f\022\004\b\025\020\t\032\004\b\026\020\013R\032\020\027\032\0020\0078FX\004¢\006\f\022\004\b\030\020\t\032\004\b\031\020\013R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\034\032\004\b\032\020\033\001\002\002\013\n\005\b¡\0360\001\n\002\b!¨\006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,723:1\n322#2:724\n650#3,12:725\n662#3,17:738\n650#3,12:755\n662#3,17:768\n650#3,12:785\n662#3,17:798\n22#4:737\n22#4:767\n22#4:797\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n128#1:724\n164#1:725,12\n164#1:738,17\n186#1:755,12\n186#1:768,17\n208#1:785,12\n208#1:798,17\n164#1:737\n186#1:767\n208#1:797\n*E\n"})
/*     */ public final class Color
/*     */ {
/*     */   public final long getValue-s-VKNKU() {
/* 120 */     return this.value;
/*     */   }
/*     */   public static final long convert-vNxB06k(long arg0, @NotNull ColorSpace colorSpace) {
/*     */     Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
/*     */     Connector connector = ColorSpaceKt.connect-YBCOT_4$default(getColorSpace-impl(arg0), colorSpace, 0, 2, null);
/*     */     return connector.transformToColor-l2rxGTc$ui_graphics(arg0);
/*     */   }
/*     */   @NotNull
/* 128 */   public static final ColorSpace getColorSpace-impl(long arg0) { ColorSpaces colorSpaces = ColorSpaces.INSTANCE; int i = (int)ULong.constructor-impl(arg0 & 0x3FL), $i$f$getColorSpace$ui_graphics = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 724 */       colorSpaces.getColorSpacesArray$ui_graphics()[i]; } public static final float getRed-impl(long arg0) { short s = (short)(int)ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 48L) & 0xFFFFL); int $i$f$halfToFloat = 0;
/* 725 */     int bits$iv = s & 0xFFFF;
/* 726 */     int s$iv = bits$iv & 0x8000;
/* 727 */     int e$iv = bits$iv >>> 10 & 0x1F;
/* 728 */     int m$iv = bits$iv & 0x3FF;
/*     */     
/* 730 */     int outE$iv = 0;
/* 731 */     int outM$iv = 0;
/*     */     
/* 733 */     if (e$iv == 0) {
/* 734 */       if (m$iv != 0) {
/*     */         
/* 736 */         int bits$iv$iv = 1056964608 + m$iv, i = 0; float o$iv = 
/* 737 */           Float.intBitsToFloat(bits$iv$iv);
/* 738 */         o$iv -= Float16Kt.access$getFp32DenormalFloat$p();
/* 739 */         return (s$iv == 0) ? o$iv : -o$iv;
/*     */       } 
/*     */     } else {
/* 742 */       outM$iv = m$iv << 13;
/* 743 */       if (e$iv == 31) {
/* 744 */         outE$iv = 255;
/* 745 */         if (outM$iv != 0) {
/* 746 */           outM$iv |= 0x400000;
/*     */         }
/*     */       } else {
/* 749 */         outE$iv = e$iv - 15 + 127;
/*     */       } 
/*     */     } 
/*     */     
/* 753 */     int out$iv = s$iv << 16 | outE$iv << 23 | outM$iv;
/* 754 */     int $i$f$floatFromBits = 0; return (ULong.constructor-impl(arg0 & 0x3FL) == 0L) ? ((float)UnsignedKt.ulongToDouble(ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 48L) & 0xFFL)) / 255.0F) : Float.intBitsToFloat(out$iv); } public static final float getGreen-impl(long arg0) { short s = (short)(int)ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 32L) & 0xFFFFL); int $i$f$halfToFloat = 0;
/* 755 */     int bits$iv = s & 0xFFFF;
/* 756 */     int s$iv = bits$iv & 0x8000;
/* 757 */     int e$iv = bits$iv >>> 10 & 0x1F;
/* 758 */     int m$iv = bits$iv & 0x3FF;
/*     */     
/* 760 */     int outE$iv = 0;
/* 761 */     int outM$iv = 0;
/*     */     
/* 763 */     if (e$iv == 0) {
/* 764 */       if (m$iv != 0) {
/*     */         
/* 766 */         int bits$iv$iv = 1056964608 + m$iv, i = 0; float o$iv = 
/* 767 */           Float.intBitsToFloat(bits$iv$iv);
/* 768 */         o$iv -= Float16Kt.access$getFp32DenormalFloat$p();
/* 769 */         return (s$iv == 0) ? o$iv : -o$iv;
/*     */       } 
/*     */     } else {
/* 772 */       outM$iv = m$iv << 13;
/* 773 */       if (e$iv == 31) {
/* 774 */         outE$iv = 255;
/* 775 */         if (outM$iv != 0) {
/* 776 */           outM$iv |= 0x400000;
/*     */         }
/*     */       } else {
/* 779 */         outE$iv = e$iv - 15 + 127;
/*     */       } 
/*     */     } 
/*     */     
/* 783 */     int out$iv = s$iv << 16 | outE$iv << 23 | outM$iv;
/* 784 */     int $i$f$floatFromBits = 0; return (ULong.constructor-impl(arg0 & 0x3FL) == 0L) ? ((float)UnsignedKt.ulongToDouble(ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 40L) & 0xFFL)) / 255.0F) : Float.intBitsToFloat(out$iv); } public static final float getBlue-impl(long arg0) { short s = (short)(int)ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 16L) & 0xFFFFL); int $i$f$halfToFloat = 0;
/* 785 */     int bits$iv = s & 0xFFFF;
/* 786 */     int s$iv = bits$iv & 0x8000;
/* 787 */     int e$iv = bits$iv >>> 10 & 0x1F;
/* 788 */     int m$iv = bits$iv & 0x3FF;
/*     */     
/* 790 */     int outE$iv = 0;
/* 791 */     int outM$iv = 0;
/*     */     
/* 793 */     if (e$iv == 0) {
/* 794 */       if (m$iv != 0) {
/*     */         
/* 796 */         int bits$iv$iv = 1056964608 + m$iv, i = 0; float o$iv = 
/* 797 */           Float.intBitsToFloat(bits$iv$iv);
/* 798 */         o$iv -= Float16Kt.access$getFp32DenormalFloat$p();
/* 799 */         return (s$iv == 0) ? o$iv : -o$iv;
/*     */       } 
/*     */     } else {
/* 802 */       outM$iv = m$iv << 13;
/* 803 */       if (e$iv == 31) {
/* 804 */         outE$iv = 255;
/* 805 */         if (outM$iv != 0) {
/* 806 */           outM$iv |= 0x400000;
/*     */         }
/*     */       } else {
/* 809 */         outE$iv = e$iv - 15 + 127;
/*     */       } 
/*     */     } 
/*     */     
/* 813 */     int out$iv = s$iv << 16 | outE$iv << 23 | outM$iv;
/* 814 */     int $i$f$floatFromBits = 0;
/*     */     return (ULong.constructor-impl(arg0 & 0x3FL) == 0L) ? ((float)UnsignedKt.ulongToDouble(ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 32L) & 0xFFL)) / 255.0F) : Float.intBitsToFloat(out$iv); }
/*     */ 
/*     */   
/*     */   public static final float getAlpha-impl(long arg0) {
/*     */     return (ULong.constructor-impl(arg0 & 0x3FL) == 0L) ? ((float)UnsignedKt.ulongToDouble(ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 56L) & 0xFFL)) / 255.0F) : ((float)UnsignedKt.ulongToDouble(ULong.constructor-impl(ULong.constructor-impl(arg0 >>> 6L) & 0x3FFL)) / 1023.0F);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float component1-impl(long arg0) {
/*     */     int $i$f$component1-impl = 0;
/*     */     return getRed-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float component2-impl(long arg0) {
/*     */     int $i$f$component2-impl = 0;
/*     */     return getGreen-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float component3-impl(long arg0) {
/*     */     int $i$f$component3-impl = 0;
/*     */     return getBlue-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float component4-impl(long arg0) {
/*     */     int $i$f$component4-impl = 0;
/*     */     return getAlpha-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final ColorSpace component5-impl(long arg0) {
/*     */     int $i$f$component5-impl = 0;
/*     */     return getColorSpace-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long copy-wmQWz5c(long arg0, float alpha, float red, float green, float blue) {
/*     */     return ColorKt.Color(red, green, blue, alpha, getColorSpace-impl(arg0));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return "Color(" + getRed-impl(arg0) + ", " + getGreen-impl(arg0) + ", " + getBlue-impl(arg0) + ", " + getAlpha-impl(arg0) + ", " + getColorSpace-impl(arg0).getName() + ')';
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b*\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\t\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J?\020-\032\0020\0042\006\020.\032\0020/2\006\0200\032\0020/2\006\0201\032\0020/2\b\b\002\0202\032\0020/2\b\b\002\0203\032\00204ø\001\001ø\001\000¢\006\004\b5\0206J(\0207\032\0020/2\006\0208\032\002092\006\020:\032\0020/2\006\020;\032\0020/2\006\020<\032\0020/H\002J?\020=\032\0020\0042\006\020.\032\0020/2\006\0200\032\0020/2\006\020>\032\0020/2\b\b\002\0202\032\0020/2\b\b\002\0203\032\00204ø\001\001ø\001\000¢\006\004\b?\0206J(\020@\032\0020/2\006\0208\032\002092\006\020:\032\0020/2\006\020;\032\0020/2\006\020A\032\0020/H\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007R$\020\017\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\020\020\002\032\004\b\021\020\007R$\020\022\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\023\020\002\032\004\b\024\020\007R$\020\025\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\026\020\002\032\004\b\027\020\007R$\020\030\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\031\020\002\032\004\b\032\020\007R$\020\033\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\034\020\002\032\004\b\035\020\007R$\020\036\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\037\020\002\032\004\b \020\007R$\020!\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\"\020\002\032\004\b#\020\007R$\020$\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b%\020\002\032\004\b&\020\007R$\020'\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b(\020\002\032\004\b)\020\007R$\020*\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b+\020\002\032\004\b,\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics"})
/*     */   @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,723:1\n33#2,7:724\n33#2,7:731\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n349#1:724,7\n384#1:731,7\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getBlack-0d7_KjU() {
/*     */       return Color.Black;
/*     */     }
/*     */     
/*     */     public final long getDarkGray-0d7_KjU() {
/*     */       return Color.DarkGray;
/*     */     }
/*     */     
/*     */     public final long getGray-0d7_KjU() {
/*     */       return Color.Gray;
/*     */     }
/*     */     
/*     */     public final long getLightGray-0d7_KjU() {
/*     */       return Color.LightGray;
/*     */     }
/*     */     
/*     */     public final long getWhite-0d7_KjU() {
/*     */       return Color.White;
/*     */     }
/*     */     
/*     */     public final long getRed-0d7_KjU() {
/*     */       return Color.Red;
/*     */     }
/*     */     
/*     */     public final long getGreen-0d7_KjU() {
/*     */       return Color.Green;
/*     */     }
/*     */     
/*     */     public final long getBlue-0d7_KjU() {
/*     */       return Color.Blue;
/*     */     }
/*     */     
/*     */     public final long getYellow-0d7_KjU() {
/*     */       return Color.Yellow;
/*     */     }
/*     */     
/*     */     public final long getCyan-0d7_KjU() {
/*     */       return Color.Cyan;
/*     */     }
/*     */     
/*     */     public final long getMagenta-0d7_KjU() {
/*     */       return Color.Magenta;
/*     */     }
/*     */     
/*     */     public final long getTransparent-0d7_KjU() {
/*     */       return Color.Transparent;
/*     */     }
/*     */     
/*     */     public final long getUnspecified-0d7_KjU() {
/*     */       return Color.Unspecified;
/*     */     }
/*     */     
/*     */     public final long hsv-JlNiLsg(float hue, float saturation, float value, float alpha, @NotNull Rgb colorSpace) {
/*     */       // Byte code:
/*     */       //   0: aload #5
/*     */       //   2: ldc 'colorSpace'
/*     */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   7: fconst_0
/*     */       //   8: fload_1
/*     */       //   9: fcmpg
/*     */       //   10: ifgt -> 28
/*     */       //   13: fload_1
/*     */       //   14: ldc 360.0
/*     */       //   16: fcmpg
/*     */       //   17: ifgt -> 24
/*     */       //   20: iconst_1
/*     */       //   21: goto -> 29
/*     */       //   24: iconst_0
/*     */       //   25: goto -> 29
/*     */       //   28: iconst_0
/*     */       //   29: ifeq -> 84
/*     */       //   32: fconst_0
/*     */       //   33: fload_2
/*     */       //   34: fcmpg
/*     */       //   35: ifgt -> 52
/*     */       //   38: fload_2
/*     */       //   39: fconst_1
/*     */       //   40: fcmpg
/*     */       //   41: ifgt -> 48
/*     */       //   44: iconst_1
/*     */       //   45: goto -> 53
/*     */       //   48: iconst_0
/*     */       //   49: goto -> 53
/*     */       //   52: iconst_0
/*     */       //   53: ifeq -> 84
/*     */       //   56: fconst_0
/*     */       //   57: fload_3
/*     */       //   58: fcmpg
/*     */       //   59: ifgt -> 76
/*     */       //   62: fload_3
/*     */       //   63: fconst_1
/*     */       //   64: fcmpg
/*     */       //   65: ifgt -> 72
/*     */       //   68: iconst_1
/*     */       //   69: goto -> 77
/*     */       //   72: iconst_0
/*     */       //   73: goto -> 77
/*     */       //   76: iconst_0
/*     */       //   77: ifeq -> 84
/*     */       //   80: iconst_1
/*     */       //   81: goto -> 85
/*     */       //   84: iconst_0
/*     */       //   85: istore #6
/*     */       //   87: nop
/*     */       //   88: iconst_0
/*     */       //   89: istore #7
/*     */       //   91: nop
/*     */       //   92: iload #6
/*     */       //   94: ifne -> 145
/*     */       //   97: iconst_0
/*     */       //   98: istore #8
/*     */       //   100: new java/lang/StringBuilder
/*     */       //   103: dup
/*     */       //   104: invokespecial <init> : ()V
/*     */       //   107: ldc 'HSV ('
/*     */       //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   112: fload_1
/*     */       //   113: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   116: ldc ', '
/*     */       //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   121: fload_2
/*     */       //   122: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   125: ldc ', '
/*     */       //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   130: fload_3
/*     */       //   131: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   134: ldc ') must be in range (0..360, 0..1, 0..1)'
/*     */       //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   139: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   142: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   145: nop
/*     */       //   146: aload_0
/*     */       //   147: iconst_5
/*     */       //   148: fload_1
/*     */       //   149: fload_2
/*     */       //   150: fload_3
/*     */       //   151: invokespecial hsvToRgbComponent : (IFFF)F
/*     */       //   154: fstore #6
/*     */       //   156: aload_0
/*     */       //   157: iconst_3
/*     */       //   158: fload_1
/*     */       //   159: fload_2
/*     */       //   160: fload_3
/*     */       //   161: invokespecial hsvToRgbComponent : (IFFF)F
/*     */       //   164: fstore #7
/*     */       //   166: aload_0
/*     */       //   167: iconst_1
/*     */       //   168: fload_1
/*     */       //   169: fload_2
/*     */       //   170: fload_3
/*     */       //   171: invokespecial hsvToRgbComponent : (IFFF)F
/*     */       //   174: fstore #8
/*     */       //   176: fload #6
/*     */       //   178: fload #7
/*     */       //   180: fload #8
/*     */       //   182: fload #4
/*     */       //   184: aload #5
/*     */       //   186: checkcast androidx/compose/ui/graphics/colorspace/ColorSpace
/*     */       //   189: invokestatic Color : (FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
/*     */       //   192: lreturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #350	-> 7
/*     */       //   #349	-> 87
/*     */       //   #724	-> 91
/*     */       //   #727	-> 92
/*     */       //   #728	-> 97
/*     */       //   #352	-> 100
/*     */       //   #728	-> 142
/*     */       //   #730	-> 145
/*     */       //   #354	-> 146
/*     */       //   #355	-> 156
/*     */       //   #356	-> 166
/*     */       //   #357	-> 176
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   100	42	8	$i$a$-requirePrecondition-Color$Companion$hsv$1	I
/*     */       //   91	55	7	$i$f$requirePrecondition	I
/*     */       //   88	58	6	value$iv	Z
/*     */       //   156	37	6	red	F
/*     */       //   166	27	7	green	F
/*     */       //   176	17	8	blue	F
/*     */       //   0	193	0	this	Landroidx/compose/ui/graphics/Color$Companion;
/*     */       //   0	193	1	hue	F
/*     */       //   0	193	2	saturation	F
/*     */       //   0	193	3	value	F
/*     */       //   0	193	4	alpha	F
/*     */       //   0	193	5	colorSpace	Landroidx/compose/ui/graphics/colorspace/Rgb;
/*     */     }
/*     */     
/*     */     private final float hsvToRgbComponent(int n, float h, float s, float v) {
/*     */       float k = (n + h / 60.0F) % 6.0F;
/*     */       return v - v * s * Math.max(0.0F, Math.min(k, Math.min(4 - k, 1.0F)));
/*     */     }
/*     */     
/*     */     public final long hsl-JlNiLsg(float hue, float saturation, float lightness, float alpha, @NotNull Rgb colorSpace) {
/*     */       // Byte code:
/*     */       //   0: aload #5
/*     */       //   2: ldc 'colorSpace'
/*     */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   7: fconst_0
/*     */       //   8: fload_1
/*     */       //   9: fcmpg
/*     */       //   10: ifgt -> 28
/*     */       //   13: fload_1
/*     */       //   14: ldc 360.0
/*     */       //   16: fcmpg
/*     */       //   17: ifgt -> 24
/*     */       //   20: iconst_1
/*     */       //   21: goto -> 29
/*     */       //   24: iconst_0
/*     */       //   25: goto -> 29
/*     */       //   28: iconst_0
/*     */       //   29: ifeq -> 84
/*     */       //   32: fconst_0
/*     */       //   33: fload_2
/*     */       //   34: fcmpg
/*     */       //   35: ifgt -> 52
/*     */       //   38: fload_2
/*     */       //   39: fconst_1
/*     */       //   40: fcmpg
/*     */       //   41: ifgt -> 48
/*     */       //   44: iconst_1
/*     */       //   45: goto -> 53
/*     */       //   48: iconst_0
/*     */       //   49: goto -> 53
/*     */       //   52: iconst_0
/*     */       //   53: ifeq -> 84
/*     */       //   56: fconst_0
/*     */       //   57: fload_3
/*     */       //   58: fcmpg
/*     */       //   59: ifgt -> 76
/*     */       //   62: fload_3
/*     */       //   63: fconst_1
/*     */       //   64: fcmpg
/*     */       //   65: ifgt -> 72
/*     */       //   68: iconst_1
/*     */       //   69: goto -> 77
/*     */       //   72: iconst_0
/*     */       //   73: goto -> 77
/*     */       //   76: iconst_0
/*     */       //   77: ifeq -> 84
/*     */       //   80: iconst_1
/*     */       //   81: goto -> 85
/*     */       //   84: iconst_0
/*     */       //   85: istore #6
/*     */       //   87: nop
/*     */       //   88: iconst_0
/*     */       //   89: istore #7
/*     */       //   91: nop
/*     */       //   92: iload #6
/*     */       //   94: ifne -> 145
/*     */       //   97: iconst_0
/*     */       //   98: istore #8
/*     */       //   100: new java/lang/StringBuilder
/*     */       //   103: dup
/*     */       //   104: invokespecial <init> : ()V
/*     */       //   107: ldc 'HSL ('
/*     */       //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   112: fload_1
/*     */       //   113: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   116: ldc ', '
/*     */       //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   121: fload_2
/*     */       //   122: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   125: ldc ', '
/*     */       //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   130: fload_3
/*     */       //   131: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */       //   134: ldc ') must be in range (0..360, 0..1, 0..1)'
/*     */       //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   139: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   142: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   145: nop
/*     */       //   146: aload_0
/*     */       //   147: iconst_0
/*     */       //   148: fload_1
/*     */       //   149: fload_2
/*     */       //   150: fload_3
/*     */       //   151: invokespecial hslToRgbComponent : (IFFF)F
/*     */       //   154: fstore #6
/*     */       //   156: aload_0
/*     */       //   157: bipush #8
/*     */       //   159: fload_1
/*     */       //   160: fload_2
/*     */       //   161: fload_3
/*     */       //   162: invokespecial hslToRgbComponent : (IFFF)F
/*     */       //   165: fstore #7
/*     */       //   167: aload_0
/*     */       //   168: iconst_4
/*     */       //   169: fload_1
/*     */       //   170: fload_2
/*     */       //   171: fload_3
/*     */       //   172: invokespecial hslToRgbComponent : (IFFF)F
/*     */       //   175: fstore #8
/*     */       //   177: fload #6
/*     */       //   179: fload #7
/*     */       //   181: fload #8
/*     */       //   183: fload #4
/*     */       //   185: aload #5
/*     */       //   187: checkcast androidx/compose/ui/graphics/colorspace/ColorSpace
/*     */       //   190: invokestatic Color : (FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
/*     */       //   193: lreturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #385	-> 7
/*     */       //   #384	-> 87
/*     */       //   #731	-> 91
/*     */       //   #734	-> 92
/*     */       //   #735	-> 97
/*     */       //   #387	-> 100
/*     */       //   #735	-> 142
/*     */       //   #737	-> 145
/*     */       //   #389	-> 146
/*     */       //   #390	-> 156
/*     */       //   #391	-> 167
/*     */       //   #392	-> 177
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   100	42	8	$i$a$-requirePrecondition-Color$Companion$hsl$1	I
/*     */       //   91	55	7	$i$f$requirePrecondition	I
/*     */       //   88	58	6	value$iv	Z
/*     */       //   156	38	6	red	F
/*     */       //   167	27	7	green	F
/*     */       //   177	17	8	blue	F
/*     */       //   0	194	0	this	Landroidx/compose/ui/graphics/Color$Companion;
/*     */       //   0	194	1	hue	F
/*     */       //   0	194	2	saturation	F
/*     */       //   0	194	3	lightness	F
/*     */       //   0	194	4	alpha	F
/*     */       //   0	194	5	colorSpace	Landroidx/compose/ui/graphics/colorspace/Rgb;
/*     */     }
/*     */     
/*     */     private final float hslToRgbComponent(int n, float h, float s, float l) {
/*     */       float k = (n + h / 30.0F) % 12.0F;
/*     */       float a = s * Math.min(l, 1.0F - l);
/*     */       return l - a * Math.max(-1.0F, Math.min(k - 3, Math.min(9 - k, 1.0F)));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long value;
/*     */   private static final long Black = ColorKt.Color(4278190080L);
/*     */   private static final long DarkGray = ColorKt.Color(4282664004L);
/*     */   private static final long Gray = ColorKt.Color(4287137928L);
/*     */   private static final long LightGray = ColorKt.Color(4291611852L);
/*     */   private static final long White = ColorKt.Color(4294967295L);
/*     */   private static final long Red = ColorKt.Color(4294901760L);
/*     */   private static final long Green = ColorKt.Color(4278255360L);
/*     */   private static final long Blue = ColorKt.Color(4278190335L);
/*     */   private static final long Yellow = ColorKt.Color(4294967040L);
/*     */   private static final long Cyan = ColorKt.Color(4278255615L);
/*     */   private static final long Magenta = ColorKt.Color(4294902015L);
/*     */   private static final long Transparent = ColorKt.Color(0);
/*     */   private static final long Unspecified = ColorKt.Color(0.0F, 0.0F, 0.0F, 0.0F, (ColorSpace)ColorSpaces.INSTANCE.getUnspecified$ui_graphics());
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return ULong.hashCode-impl(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof Color))
/*     */       return false; 
/*     */     long l = ((Color)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return ULong.equals-impl0(p1, p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Color.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */