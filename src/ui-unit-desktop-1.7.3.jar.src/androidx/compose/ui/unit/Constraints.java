/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.ExperimentalComposeUiApi;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b!\n\002\020\016\n\002\b\004\b@\030\000 02\0020\001:\0010B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J;\020#\032\0020\0002\b\b\002\020 \032\0020\0072\b\b\002\020\034\032\0020\0072\b\b\002\020\036\032\0020\0072\b\b\002\020\032\032\0020\007ø\001\000ø\001\001¢\006\004\b$\020%J\032\020&\032\0020\0132\b\020'\032\004\030\0010\001HÖ\003¢\006\004\b(\020)J\020\020*\032\0020\007HÖ\001¢\006\004\b+\020\tJ\017\020,\032\0020-H\026¢\006\004\b.\020/R\025\020\006\032\0020\0078Â\002X\004¢\006\006\032\004\b\b\020\tR\021\020\n\032\0020\0138F¢\006\006\032\004\b\f\020\rR\021\020\016\032\0020\0138F¢\006\006\032\004\b\017\020\rR\032\020\020\032\0020\0138FX\004¢\006\f\022\004\b\021\020\022\032\004\b\023\020\rR\032\020\024\032\0020\0138FX\004¢\006\f\022\004\b\025\020\022\032\004\b\026\020\rR\032\020\027\032\0020\0138FX\004¢\006\f\022\004\b\030\020\022\032\004\b\031\020\rR\021\020\032\032\0020\0078F¢\006\006\032\004\b\033\020\tR\021\020\034\032\0020\0078F¢\006\006\032\004\b\035\020\tR\021\020\036\032\0020\0078F¢\006\006\032\004\b\037\020\tR\021\020 \032\0020\0078F¢\006\006\032\004\b!\020\tR\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\"\020\022\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\0061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n69#1:708\n69#1:711\n69#1:714\n69#1:718\n69#1:722\n69#1:725\n69#1:729\n69#1:732\n69#1:736\n686#2:709\n700#2:710\n686#2:712\n700#2:713\n686#2:715\n706#2:716\n694#2:717\n686#2:719\n706#2:720\n694#2:721\n686#2:723\n700#2:724\n686#2:726\n706#2:727\n694#2:728\n686#2:730\n700#2:731\n686#2:733\n706#2:734\n694#2:735\n686#2:737\n700#2:738\n694#2:739\n706#2:740\n37#3,7:741\n37#3,7:748\n37#3,7:755\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n76#1:708\n86#1:711\n96#1:714\n108#1:718\n121#1:722\n131#1:725\n142#1:729\n155#1:732\n171#1:736\n76#1:709\n76#1:710\n86#1:712\n86#1:713\n96#1:715\n97#1:716\n98#1:717\n108#1:719\n109#1:720\n110#1:721\n121#1:723\n121#1:724\n131#1:726\n132#1:727\n133#1:728\n142#1:730\n142#1:731\n155#1:733\n156#1:734\n157#1:735\n171#1:737\n175#1:738\n179#1:739\n180#1:740\n196#1:741,7\n200#1:748,7\n204#1:755,7\n*E\n"})
/*     */ public final class Constraints
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long value;
/*     */   public static final int Infinity = 2147483647;
/*     */   
/*     */   private static final int getFocusIndex-impl(long arg0) {
/*  69 */     int $i$f$getFocusIndex-impl = 0; return (int)(arg0 & 0x3L);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getMinWidth-impl(long arg0) {
/*  76 */     int $i$f$getFocusIndex-impl = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 708 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L); int $i$f$indexToBitOffset = 0;
/* 709 */     int index$iv = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 710 */     int $i$f$widthMask = 0, mask = (1 << 13 + index$iv) - 1; return (int)(arg0 >> 2L) & mask; } public static final int getMaxWidth-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 711 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L); int $i$f$indexToBitOffset = 0;
/* 712 */     int index$iv = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 713 */     int $i$f$widthMask = 0, mask = (1 << 13 + index$iv) - 1; int width = (int)(arg0 >> 33L) & mask; return (width == 0) ? Integer.MAX_VALUE : (width - 1); } public static final int getMinHeight-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 714 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L);
/* 715 */     int $i$f$indexToBitOffset = 0, bitOffset = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 716 */     int $i$f$heightMask = 0, mask = (1 << 18 - bitOffset) - 1;
/* 717 */     int $i$f$minHeightOffsets = 0, offset = 15 + bitOffset; return (int)(arg0 >> offset) & mask; } public static final int getMaxHeight-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 718 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L);
/* 719 */     int $i$f$indexToBitOffset = 0, bitOffset = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 720 */     int $i$f$heightMask = 0, mask = (1 << 18 - bitOffset) - 1;
/* 721 */     int $i$f$minHeightOffsets = 0, offset = 15 + bitOffset + 31; int height = (int)(arg0 >> offset) & mask; return (height == 0) ? Integer.MAX_VALUE : (height - 1); } public static final boolean getHasBoundedWidth-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 722 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L); int $i$f$indexToBitOffset = 0;
/* 723 */     int index$iv = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 724 */     int $i$f$widthMask = 0, mask = (1 << 13 + index$iv) - 1; return (((int)(arg0 >> 33L) & mask) != 0); } public static final boolean getHasBoundedHeight-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 725 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L);
/* 726 */     int $i$f$indexToBitOffset = 0, bitOffset = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 727 */     int $i$f$heightMask = 0, mask = (1 << 18 - bitOffset) - 1;
/* 728 */     int $i$f$minHeightOffsets = 0, offset = 15 + bitOffset + 31; return (((int)(arg0 >> offset) & mask) != 0); } public static final boolean getHasFixedWidth-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 729 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L); int $i$f$indexToBitOffset = 0;
/* 730 */     int index$iv = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 731 */     int $i$f$widthMask = 0, mask = (1 << 13 + index$iv) - 1; int minWidth = (int)(arg0 >> 2L) & mask; int it = (int)(arg0 >> 33L) & mask, $i$a$-let-Constraints$hasFixedWidth$maxWidth$1 = 0, maxWidth = (it == 0) ? Integer.MAX_VALUE : (it - 1); return (minWidth == maxWidth); } public static final boolean getHasFixedHeight-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 732 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L);
/* 733 */     int $i$f$indexToBitOffset = 0, bitOffset = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 734 */     int $i$f$heightMask = 0, mask = (1 << 18 - bitOffset) - 1;
/* 735 */     int $i$f$minHeightOffsets = 0, offset = 15 + bitOffset; int minHeight = (int)(arg0 >> offset) & mask; int it = (int)(arg0 >> offset + 31) & mask, $i$a$-let-Constraints$hasFixedHeight$maxHeight$1 = 0, maxHeight = (it == 0) ? Integer.MAX_VALUE : (it - 1); return (minHeight == maxHeight); } public static final boolean isZero-impl(long arg0) { int $i$f$getFocusIndex-impl = 0;
/* 736 */     $i$f$getFocusIndex-impl = (int)(arg0 & 0x3L);
/* 737 */     int $i$f$indexToBitOffset = 0, bitOffset = (($i$f$getFocusIndex-impl & 0x1) << 1) + (($i$f$getFocusIndex-impl & 0x2) >> 1) * 3;
/* 738 */     int $i$f$widthMask = 0, maxWidth = ((int)(arg0 >> 33L) & (1 << 13 + bitOffset) - 1) - 1; if (maxWidth == 0)
/* 739 */       return true;  int $i$f$minHeightOffsets = 0, offset = 15 + bitOffset + 31;
/* 740 */     int $i$f$heightMask = 0, maxHeight = ((int)(arg0 >> offset) & (1 << 18 - bitOffset) - 1) - 1;
/*     */     return (maxHeight == 0); }
/*     */ 
/*     */   
/*     */   public static final long copy-Zbe2FdA(long arg0, int minWidth, int maxWidth, int minHeight, int maxHeight) {
/*     */     // Byte code:
/*     */     //   0: iload #4
/*     */     //   2: iflt -> 13
/*     */     //   5: iload_2
/*     */     //   6: iflt -> 13
/*     */     //   9: iconst_1
/*     */     //   10: goto -> 14
/*     */     //   13: iconst_0
/*     */     //   14: istore #6
/*     */     //   16: iconst_0
/*     */     //   17: istore #7
/*     */     //   19: nop
/*     */     //   20: iload #6
/*     */     //   22: ifne -> 65
/*     */     //   25: iconst_0
/*     */     //   26: istore #8
/*     */     //   28: new java/lang/StringBuilder
/*     */     //   31: dup
/*     */     //   32: invokespecial <init> : ()V
/*     */     //   35: ldc 'minHeight('
/*     */     //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   40: iload #4
/*     */     //   42: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   45: ldc ') and minWidth('
/*     */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   50: iload_2
/*     */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   54: ldc ') must be >= 0'
/*     */     //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   59: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   62: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   65: nop
/*     */     //   66: iload_3
/*     */     //   67: iload_2
/*     */     //   68: if_icmplt -> 75
/*     */     //   71: iconst_1
/*     */     //   72: goto -> 76
/*     */     //   75: iconst_0
/*     */     //   76: istore #6
/*     */     //   78: iconst_0
/*     */     //   79: istore #7
/*     */     //   81: nop
/*     */     //   82: iload #6
/*     */     //   84: ifne -> 126
/*     */     //   87: iconst_0
/*     */     //   88: istore #8
/*     */     //   90: new java/lang/StringBuilder
/*     */     //   93: dup
/*     */     //   94: invokespecial <init> : ()V
/*     */     //   97: ldc 'maxWidth('
/*     */     //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   102: iload_3
/*     */     //   103: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   106: ldc ') must be >= minWidth('
/*     */     //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   111: iload_2
/*     */     //   112: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   115: bipush #41
/*     */     //   117: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   120: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   123: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   126: nop
/*     */     //   127: iload #5
/*     */     //   129: iload #4
/*     */     //   131: if_icmplt -> 138
/*     */     //   134: iconst_1
/*     */     //   135: goto -> 139
/*     */     //   138: iconst_0
/*     */     //   139: istore #6
/*     */     //   141: iconst_0
/*     */     //   142: istore #7
/*     */     //   144: nop
/*     */     //   145: iload #6
/*     */     //   147: ifne -> 191
/*     */     //   150: iconst_0
/*     */     //   151: istore #8
/*     */     //   153: new java/lang/StringBuilder
/*     */     //   156: dup
/*     */     //   157: invokespecial <init> : ()V
/*     */     //   160: ldc 'maxHeight('
/*     */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   165: iload #5
/*     */     //   167: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   170: ldc ') must be >= minHeight('
/*     */     //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   175: iload #4
/*     */     //   177: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   180: bipush #41
/*     */     //   182: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   185: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   188: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   191: nop
/*     */     //   192: iload_2
/*     */     //   193: iload_3
/*     */     //   194: iload #4
/*     */     //   196: iload #5
/*     */     //   198: invokestatic createConstraints : (IIII)J
/*     */     //   201: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #196	-> 0
/*     */     //   #741	-> 19
/*     */     //   #744	-> 20
/*     */     //   #745	-> 25
/*     */     //   #197	-> 28
/*     */     //   #745	-> 62
/*     */     //   #747	-> 65
/*     */     //   #200	-> 66
/*     */     //   #748	-> 81
/*     */     //   #751	-> 82
/*     */     //   #752	-> 87
/*     */     //   #201	-> 90
/*     */     //   #752	-> 123
/*     */     //   #754	-> 126
/*     */     //   #204	-> 127
/*     */     //   #755	-> 144
/*     */     //   #758	-> 145
/*     */     //   #759	-> 150
/*     */     //   #205	-> 153
/*     */     //   #759	-> 188
/*     */     //   #761	-> 191
/*     */     //   #207	-> 192
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   28	34	8	$i$a$-requirePrecondition-Constraints$copy$1	I
/*     */     //   19	47	7	$i$f$requirePrecondition	I
/*     */     //   16	50	6	value$iv	Z
/*     */     //   90	33	8	$i$a$-requirePrecondition-Constraints$copy$2	I
/*     */     //   81	46	7	$i$f$requirePrecondition	I
/*     */     //   78	49	6	value$iv	Z
/*     */     //   153	35	8	$i$a$-requirePrecondition-Constraints$copy$3	I
/*     */     //   144	48	7	$i$f$requirePrecondition	I
/*     */     //   141	51	6	value$iv	Z
/*     */     //   0	202	0	arg0	J
/*     */     //   0	202	2	minWidth	I
/*     */     //   0	202	3	maxWidth	I
/*     */     //   0	202	4	minHeight	I
/*     */     //   0	202	5	maxHeight	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     int maxWidth = getMaxWidth-impl(arg0);
/*     */     String maxWidthStr = (maxWidth == Integer.MAX_VALUE) ? "Infinity" : String.valueOf(maxWidth);
/*     */     int maxHeight = getMaxHeight-impl(arg0);
/*     */     String maxHeightStr = (maxHeight == Integer.MAX_VALUE) ? "Infinity" : String.valueOf(maxHeight);
/*     */     return "Constraints(minWidth = " + getMinWidth-impl(arg0) + ", maxWidth = " + maxWidthStr + ", minHeight = " + getMinHeight-impl(arg0) + ", maxHeight = " + maxHeightStr + ')';
/*     */   }
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return Long.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof Constraints))
/*     */       return false; 
/*     */     long l = ((Constraints)other).unbox-impl();
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
/*     */     return (p1 == p2);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J5\020\005\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\0042\006\020\t\032\0020\0042\006\020\n\032\0020\004H\007ø\001\000ø\001\001¢\006\004\b\013\020\fJ5\020\r\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\0042\006\020\t\032\0020\0042\006\020\n\032\0020\004H\007ø\001\000ø\001\001¢\006\004\b\016\020\fJ%\020\017\032\0020\0062\006\020\020\032\0020\0042\006\020\021\032\0020\004H\007ø\001\000ø\001\001¢\006\004\b\022\020\023J\035\020\024\032\0020\0062\006\020\021\032\0020\004H\007ø\001\000ø\001\001¢\006\004\b\025\020\026J\035\020\027\032\0020\0062\006\020\020\032\0020\004H\007ø\001\000ø\001\001¢\006\004\b\030\020\026J?\020\031\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\0042\006\020\t\032\0020\0042\006\020\n\032\0020\0042\b\b\002\020\032\032\0020\033H\007ø\001\000ø\001\001¢\006\004\b\034\020\035R\016\020\003\032\0020\004XT¢\006\002\n\000\002\013\n\002\b!\n\005\b¡\0360\001¨\006\036"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "Infinity", "", "fitPrioritizingHeight", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingHeight-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "restrictConstraints", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "ui-unit"})
/*     */   @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n37#2,7:708\n37#2,7:715\n37#2,7:722\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n235#1:708,7\n248#1:715,7\n266#1:722,7\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @Stable
/*     */     public final long fixed-JhjzzOo(int width, int height) {
/*     */       // Byte code:
/*     */       //   0: iload_1
/*     */       //   1: iflt -> 12
/*     */       //   4: iload_2
/*     */       //   5: iflt -> 12
/*     */       //   8: iconst_1
/*     */       //   9: goto -> 13
/*     */       //   12: iconst_0
/*     */       //   13: istore_3
/*     */       //   14: iconst_0
/*     */       //   15: istore #4
/*     */       //   17: nop
/*     */       //   18: iload_3
/*     */       //   19: ifne -> 61
/*     */       //   22: iconst_0
/*     */       //   23: istore #5
/*     */       //   25: new java/lang/StringBuilder
/*     */       //   28: dup
/*     */       //   29: invokespecial <init> : ()V
/*     */       //   32: ldc 'width('
/*     */       //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   37: iload_1
/*     */       //   38: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */       //   41: ldc ') and height('
/*     */       //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   46: iload_2
/*     */       //   47: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */       //   50: ldc ') must be >= 0'
/*     */       //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   55: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   58: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   61: nop
/*     */       //   62: iload_1
/*     */       //   63: iload_1
/*     */       //   64: iload_2
/*     */       //   65: iload_2
/*     */       //   66: invokestatic createConstraints : (IIII)J
/*     */       //   69: lreturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #235	-> 0
/*     */       //   #708	-> 17
/*     */       //   #711	-> 18
/*     */       //   #712	-> 22
/*     */       //   #236	-> 25
/*     */       //   #712	-> 58
/*     */       //   #714	-> 61
/*     */       //   #238	-> 62
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   25	33	5	$i$a$-requirePrecondition-Constraints$Companion$fixed$1	I
/*     */       //   17	45	4	$i$f$requirePrecondition	I
/*     */       //   14	48	3	value$iv	Z
/*     */       //   0	70	0	this	Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   0	70	1	width	I
/*     */       //   0	70	2	height	I
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public final long fixedWidth-OenEA2s(int width) {
/*     */       // Byte code:
/*     */       //   0: iload_1
/*     */       //   1: iflt -> 8
/*     */       //   4: iconst_1
/*     */       //   5: goto -> 9
/*     */       //   8: iconst_0
/*     */       //   9: istore_2
/*     */       //   10: iconst_0
/*     */       //   11: istore_3
/*     */       //   12: nop
/*     */       //   13: iload_2
/*     */       //   14: ifne -> 47
/*     */       //   17: iconst_0
/*     */       //   18: istore #4
/*     */       //   20: new java/lang/StringBuilder
/*     */       //   23: dup
/*     */       //   24: invokespecial <init> : ()V
/*     */       //   27: ldc 'width('
/*     */       //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   32: iload_1
/*     */       //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */       //   36: ldc ') must be >= 0'
/*     */       //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   41: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   44: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   47: nop
/*     */       //   48: iload_1
/*     */       //   49: iload_1
/*     */       //   50: iconst_0
/*     */       //   51: ldc 2147483647
/*     */       //   53: invokestatic createConstraints : (IIII)J
/*     */       //   56: lreturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #248	-> 0
/*     */       //   #715	-> 12
/*     */       //   #718	-> 13
/*     */       //   #719	-> 17
/*     */       //   #249	-> 20
/*     */       //   #719	-> 44
/*     */       //   #721	-> 47
/*     */       //   #252	-> 48
/*     */       //   #253	-> 49
/*     */       //   #254	-> 50
/*     */       //   #255	-> 51
/*     */       //   #251	-> 53
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   20	24	4	$i$a$-requirePrecondition-Constraints$Companion$fixedWidth$1	I
/*     */       //   12	36	3	$i$f$requirePrecondition	I
/*     */       //   10	38	2	value$iv	Z
/*     */       //   0	57	0	this	Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   0	57	1	width	I
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public final long fixedHeight-OenEA2s(int height) {
/*     */       // Byte code:
/*     */       //   0: iload_1
/*     */       //   1: iflt -> 8
/*     */       //   4: iconst_1
/*     */       //   5: goto -> 9
/*     */       //   8: iconst_0
/*     */       //   9: istore_2
/*     */       //   10: iconst_0
/*     */       //   11: istore_3
/*     */       //   12: nop
/*     */       //   13: iload_2
/*     */       //   14: ifne -> 47
/*     */       //   17: iconst_0
/*     */       //   18: istore #4
/*     */       //   20: new java/lang/StringBuilder
/*     */       //   23: dup
/*     */       //   24: invokespecial <init> : ()V
/*     */       //   27: ldc 'height('
/*     */       //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   32: iload_1
/*     */       //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */       //   36: ldc ') must be >= 0'
/*     */       //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   41: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   44: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   47: nop
/*     */       //   48: iconst_0
/*     */       //   49: ldc 2147483647
/*     */       //   51: iload_1
/*     */       //   52: iload_1
/*     */       //   53: invokestatic createConstraints : (IIII)J
/*     */       //   56: lreturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #266	-> 0
/*     */       //   #722	-> 12
/*     */       //   #725	-> 13
/*     */       //   #726	-> 17
/*     */       //   #267	-> 20
/*     */       //   #726	-> 44
/*     */       //   #728	-> 47
/*     */       //   #270	-> 48
/*     */       //   #271	-> 49
/*     */       //   #272	-> 51
/*     */       //   #273	-> 52
/*     */       //   #269	-> 53
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   20	24	4	$i$a$-requirePrecondition-Constraints$Companion$fixedHeight$1	I
/*     */       //   12	36	3	$i$f$requirePrecondition	I
/*     */       //   10	38	2	value$iv	Z
/*     */       //   0	57	0	this	Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   0	57	1	height	I
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
/*     */     @ExperimentalComposeUiApi
/*     */     @Stable
/*     */     public final long restrictConstraints-xF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
/*     */       return prioritizeWidth ? fitPrioritizingWidth-Zbe2FdA(minWidth, maxWidth, minHeight, maxHeight) : fitPrioritizingHeight-Zbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public final long fitPrioritizingWidth-Zbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
/*     */       int minW = Math.min(minWidth, 262142);
/*     */       int maxW = (maxWidth == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
/*     */       int consumed = (maxW == Integer.MAX_VALUE) ? minW : maxW;
/*     */       int maxAllowed = ConstraintsKt.access$maxAllowedForSize(consumed);
/*     */       int maxH = (maxHeight == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.min(maxAllowed, maxHeight);
/*     */       int minH = Math.min(maxAllowed, minHeight);
/*     */       return ConstraintsKt.Constraints(minW, maxW, minH, maxH);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public final long fitPrioritizingHeight-Zbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
/*     */       int minH = Math.min(minHeight, 262142);
/*     */       int maxH = (maxHeight == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
/*     */       int consumed = (maxH == Integer.MAX_VALUE) ? minH : maxH;
/*     */       int maxAllowed = ConstraintsKt.access$maxAllowedForSize(consumed);
/*     */       int maxW = (maxWidth == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.min(maxAllowed, maxWidth);
/*     */       int minW = Math.min(maxAllowed, minWidth);
/*     */       return ConstraintsKt.Constraints(minW, maxW, minH, maxH);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\Constraints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */