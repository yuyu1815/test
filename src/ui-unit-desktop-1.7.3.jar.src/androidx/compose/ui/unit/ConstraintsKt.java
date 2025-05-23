/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\t\n\000\n\002\020\b\n\002\b\021\n\002\030\002\n\002\b\020\n\002\020\002\n\002\b\003\n\002\020\001\n\002\b\007\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\b\0325\020\024\032\0020\0252\b\b\002\020\026\032\0020\0032\b\b\002\020\027\032\0020\0032\b\b\002\020\030\032\0020\0032\b\b\002\020\031\032\0020\003H\007¢\006\002\020\032\032\030\020\033\032\0020\0032\006\020\034\032\0020\0032\006\020\035\032\0020\003H\002\032\020\020\036\032\0020\0032\006\020\037\032\0020\003H\002\032-\020 \032\0020\0252\006\020\026\032\0020\0032\006\020\027\032\0020\0032\006\020\030\032\0020\0032\006\020\031\032\0020\003H\000¢\006\002\020\032\032\021\020!\032\0020\0032\006\020\"\032\0020\003H\b\032\021\020#\032\0020\0032\006\020$\032\0020\003H\b\032\030\020%\032\0020&2\006\020'\032\0020\0032\006\020(\032\0020\003H\002\032\020\020)\032\0020*2\006\020\037\032\0020\003H\002\032\020\020+\032\0020\0032\006\020\037\032\0020\003H\002\032\021\020,\032\0020\0032\006\020\"\032\0020\003H\b\032\021\020-\032\0020\0032\006\020\"\032\0020\003H\b\032\034\020.\032\0020\025*\0020\0252\006\020/\032\0020\025ø\001\000¢\006\004\b0\0201\032\036\020.\032\00202*\0020\0252\006\020\037\032\00202H\007ø\001\000¢\006\004\b3\0201\032\036\0204\032\0020\003*\0020\0252\006\0205\032\0020\003H\007ø\001\000¢\006\004\b6\0207\032\036\0208\032\0020\003*\0020\0252\006\0209\032\0020\003H\007ø\001\000¢\006\004\b:\0207\032\036\020;\032\0020<*\0020\0252\006\020\037\032\00202H\007ø\001\000¢\006\004\b=\020>\032*\020?\032\0020\025*\0020\0252\b\b\002\020@\032\0020\0032\b\b\002\020A\032\0020\003H\007ø\001\000¢\006\004\bB\020C\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\003XT¢\006\002\n\000\"\016\020\004\032\0020\003XT¢\006\002\n\000\"\016\020\005\032\0020\003XT¢\006\002\n\000\"\016\020\006\032\0020\003XT¢\006\002\n\000\"\016\020\007\032\0020\003XT¢\006\002\n\000\"\016\020\b\032\0020\003XT¢\006\002\n\000\"\016\020\t\032\0020\003XT¢\006\002\n\000\"\016\020\n\032\0020\003XT¢\006\002\n\000\"\016\020\013\032\0020\003XT¢\006\002\n\000\"\016\020\f\032\0020\003XT¢\006\002\n\000\"\016\020\r\032\0020\003XT¢\006\002\n\000\"\016\020\016\032\0020\003XT¢\006\002\n\000\"\016\020\017\032\0020\003XT¢\006\002\n\000\"\016\020\020\032\0020\003XT¢\006\002\n\000\"\016\020\021\032\0020\003XT¢\006\002\n\000\"\016\020\022\032\0020\003XT¢\006\002\n\000\"\016\020\023\032\0020\003XT¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006D"}, d2 = {"FocusMask", "", "Infinity", "", "MaxAllowedForMaxFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxAllowedForMinFocusBits", "MaxAllowedForMinNonFocusBits", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinNonFocusBits", "MinNonFocusMask", "Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "bitsNeedForSizeUnchecked", "size", "createConstraints", "heightMask", "bitOffset", "indexToBitOffset", "index", "invalidConstraint", "", "widthVal", "heightVal", "invalidSize", "", "maxAllowedForSize", "minHeightOffsets", "widthMask", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit"})
/*     */ @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,707:1\n686#1,9:708\n37#2,7:717\n37#2,7:724\n37#2,7:731\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n506#1:708,9\n549#1:717,7\n552#1:724,7\n555#1:731,7\n*E\n"})
/*     */ public final class ConstraintsKt
/*     */ {
/*     */   private static final int Infinity = 2147483647;
/*     */   private static final int MinFocusWidth = 2;
/*     */   private static final int MaxFocusWidth = 3;
/*     */   private static final int MinFocusHeight = 1;
/*     */   private static final int MaxFocusHeight = 0;
/*     */   private static final long FocusMask = 3L;
/*     */   private static final int MinFocusBits = 16;
/*     */   private static final int MaxAllowedForMinFocusBits = 32766;
/*     */   private static final int MinFocusMask = 65535;
/*     */   private static final int MinNonFocusBits = 15;
/*     */   private static final int MaxAllowedForMinNonFocusBits = 65534;
/*     */   private static final int MinNonFocusMask = 32767;
/*     */   private static final int MaxFocusBits = 18;
/*     */   private static final int MaxAllowedForMaxFocusBits = 8190;
/*     */   private static final int MaxFocusMask = 262143;
/*     */   private static final int MaxNonFocusBits = 13;
/*     */   private static final int MaxAllowedForMaxNonFocusBits = 262142;
/*     */   private static final int MaxNonFocusMask = 8191;
/*     */   
/*     */   private static final void invalidConstraint(int widthVal, int heightVal) {
/* 459 */     throw new IllegalArgumentException(
/* 460 */         "Can't represent a width of " + widthVal + " and height of " + heightVal + " in Constraints");
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Void invalidSize(int size) {
/* 465 */     throw new IllegalArgumentException(
/* 466 */         "Can't represent a size of " + size + " in Constraints");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long createConstraints(int minWidth, int maxWidth, int minHeight, int maxHeight) {
/* 479 */     int heightVal = (maxHeight == Integer.MAX_VALUE) ? minHeight : maxHeight;
/* 480 */     int heightBits = bitsNeedForSizeUnchecked(heightVal);
/*     */     
/* 482 */     int widthVal = (maxWidth == Integer.MAX_VALUE) ? minWidth : maxWidth;
/* 483 */     int widthBits = bitsNeedForSizeUnchecked(widthVal);
/*     */     
/* 485 */     if (widthBits + heightBits > 31) {
/* 486 */       invalidConstraint(widthVal, heightVal);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 492 */     int maxWidthValue = maxWidth + 1;
/* 493 */     maxWidthValue &= maxWidthValue >> 31 ^ 0xFFFFFFFF;
/*     */     
/* 495 */     int maxHeightValue = maxHeight + 1;
/* 496 */     maxHeightValue &= maxHeightValue >> 31 ^ 0xFFFFFFFF;
/*     */     
/* 498 */     switch (widthBits) { case 15: case 16: case 13: case 18: default: break; }  int focus = 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 503 */       0;
/*     */ 
/*     */     
/* 506 */     int $i$f$indexToBitOffset = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 708 */     int bitOffset$iv = ((focus & 0x1) << 1) + ((focus & 0x2) >> 1) * 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 716 */     int $i$f$minHeightOffsets = 0, minHeightOffset = 15 + bitOffset$iv;
/*     */     int maxHeightOffset = minHeightOffset + 31;
/*     */     long value = focus | minWidth << 2L | maxWidthValue << 33L | minHeight << minHeightOffset | maxHeightValue << maxHeightOffset;
/*     */     return Constraints.constructor-impl(value);
/*     */   }
/*     */   
/*     */   private static final int bitsNeedForSizeUnchecked(int size) {
/*     */     return (size < 8191) ? 13 : ((size < 32767) ? 15 : ((size < 65535) ? 16 : ((size < 262143) ? 18 : 255)));
/*     */   }
/*     */   
/*     */   private static final int maxAllowedForSize(int size) {
/*     */     if (size < 262143) {
/*     */     
/*     */     } else {
/*     */       invalidSize(size);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     return (size < 8191) ? 262142 : ((size < 32767) ? 65534 : ((size < 65535) ? 32766 : "JD-Core does not support Kotlin"));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long Constraints(int minWidth, int maxWidth, int minHeight, int maxHeight) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: iload_0
/*     */     //   2: if_icmplt -> 9
/*     */     //   5: iconst_1
/*     */     //   6: goto -> 10
/*     */     //   9: iconst_0
/*     */     //   10: istore #4
/*     */     //   12: iconst_0
/*     */     //   13: istore #5
/*     */     //   15: nop
/*     */     //   16: iload #4
/*     */     //   18: ifne -> 60
/*     */     //   21: iconst_0
/*     */     //   22: istore #6
/*     */     //   24: new java/lang/StringBuilder
/*     */     //   27: dup
/*     */     //   28: invokespecial <init> : ()V
/*     */     //   31: ldc 'maxWidth('
/*     */     //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   36: iload_1
/*     */     //   37: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   40: ldc ') must be >= than minWidth('
/*     */     //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   45: iload_0
/*     */     //   46: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   49: bipush #41
/*     */     //   51: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   57: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   60: nop
/*     */     //   61: iload_3
/*     */     //   62: iload_2
/*     */     //   63: if_icmplt -> 70
/*     */     //   66: iconst_1
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_0
/*     */     //   71: istore #4
/*     */     //   73: iconst_0
/*     */     //   74: istore #5
/*     */     //   76: nop
/*     */     //   77: iload #4
/*     */     //   79: ifne -> 121
/*     */     //   82: iconst_0
/*     */     //   83: istore #6
/*     */     //   85: new java/lang/StringBuilder
/*     */     //   88: dup
/*     */     //   89: invokespecial <init> : ()V
/*     */     //   92: ldc 'maxHeight('
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   97: iload_3
/*     */     //   98: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   101: ldc ') must be >= than minHeight('
/*     */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   106: iload_2
/*     */     //   107: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   110: bipush #41
/*     */     //   112: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   115: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   118: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   121: nop
/*     */     //   122: iload_0
/*     */     //   123: iflt -> 134
/*     */     //   126: iload_2
/*     */     //   127: iflt -> 134
/*     */     //   130: iconst_1
/*     */     //   131: goto -> 135
/*     */     //   134: iconst_0
/*     */     //   135: istore #4
/*     */     //   137: iconst_0
/*     */     //   138: istore #5
/*     */     //   140: nop
/*     */     //   141: iload #4
/*     */     //   143: ifne -> 185
/*     */     //   146: iconst_0
/*     */     //   147: istore #6
/*     */     //   149: new java/lang/StringBuilder
/*     */     //   152: dup
/*     */     //   153: invokespecial <init> : ()V
/*     */     //   156: ldc 'minWidth('
/*     */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   161: iload_0
/*     */     //   162: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   165: ldc ') and minHeight('
/*     */     //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   170: iload_2
/*     */     //   171: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   174: ldc ') must be >= 0'
/*     */     //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   179: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   182: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   185: nop
/*     */     //   186: iload_0
/*     */     //   187: iload_1
/*     */     //   188: iload_2
/*     */     //   189: iload_3
/*     */     //   190: invokestatic createConstraints : (IIII)J
/*     */     //   193: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #549	-> 0
/*     */     //   #717	-> 15
/*     */     //   #720	-> 16
/*     */     //   #721	-> 21
/*     */     //   #550	-> 24
/*     */     //   #721	-> 57
/*     */     //   #723	-> 60
/*     */     //   #552	-> 61
/*     */     //   #724	-> 76
/*     */     //   #727	-> 77
/*     */     //   #728	-> 82
/*     */     //   #553	-> 85
/*     */     //   #728	-> 118
/*     */     //   #730	-> 121
/*     */     //   #555	-> 122
/*     */     //   #731	-> 140
/*     */     //   #734	-> 141
/*     */     //   #735	-> 146
/*     */     //   #556	-> 149
/*     */     //   #735	-> 182
/*     */     //   #737	-> 185
/*     */     //   #558	-> 186
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   24	33	6	$i$a$-requirePrecondition-ConstraintsKt$Constraints$1	I
/*     */     //   15	46	5	$i$f$requirePrecondition	I
/*     */     //   12	49	4	value$iv	Z
/*     */     //   85	33	6	$i$a$-requirePrecondition-ConstraintsKt$Constraints$2	I
/*     */     //   76	46	5	$i$f$requirePrecondition	I
/*     */     //   73	49	4	value$iv	Z
/*     */     //   149	33	6	$i$a$-requirePrecondition-ConstraintsKt$Constraints$3	I
/*     */     //   140	46	5	$i$f$requirePrecondition	I
/*     */     //   137	49	4	value$iv	Z
/*     */     //   0	194	0	minWidth	I
/*     */     //   0	194	1	maxWidth	I
/*     */     //   0	194	2	minHeight	I
/*     */     //   0	194	3	maxHeight	I
/*     */   }
/*     */   
/*     */   public static final long constrain-N9IONVI(long $this$constrain_u2dN9IONVI, long otherConstraints) {
/*     */     return Constraints(RangesKt.coerceIn(Constraints.getMinWidth-impl(otherConstraints), Constraints.getMinWidth-impl($this$constrain_u2dN9IONVI), Constraints.getMaxWidth-impl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.getMaxWidth-impl(otherConstraints), Constraints.getMinWidth-impl($this$constrain_u2dN9IONVI), Constraints.getMaxWidth-impl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.getMinHeight-impl(otherConstraints), Constraints.getMinHeight-impl($this$constrain_u2dN9IONVI), Constraints.getMaxHeight-impl($this$constrain_u2dN9IONVI)), RangesKt.coerceIn(Constraints.getMaxHeight-impl(otherConstraints), Constraints.getMinHeight-impl($this$constrain_u2dN9IONVI), Constraints.getMaxHeight-impl($this$constrain_u2dN9IONVI)));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long constrain-4WqzIAM(long $this$constrain_u2d4WqzIAM, long size) {
/*     */     return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.getWidth-impl(size), Constraints.getMinWidth-impl($this$constrain_u2d4WqzIAM), Constraints.getMaxWidth-impl($this$constrain_u2d4WqzIAM)), RangesKt.coerceIn(IntSize.getHeight-impl(size), Constraints.getMinHeight-impl($this$constrain_u2d4WqzIAM), Constraints.getMaxHeight-impl($this$constrain_u2d4WqzIAM)));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final int constrainWidth-K40F9xA(long $this$constrainWidth_u2dK40F9xA, int width) {
/*     */     return RangesKt.coerceIn(width, Constraints.getMinWidth-impl($this$constrainWidth_u2dK40F9xA), Constraints.getMaxWidth-impl($this$constrainWidth_u2dK40F9xA));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final int constrainHeight-K40F9xA(long $this$constrainHeight_u2dK40F9xA, int height) {
/*     */     return RangesKt.coerceIn(height, Constraints.getMinHeight-impl($this$constrainHeight_u2dK40F9xA), Constraints.getMaxHeight-impl($this$constrainHeight_u2dK40F9xA));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final boolean isSatisfiedBy-4WqzIAM(long $this$isSatisfiedBy_u2d4WqzIAM, long size) {
/*     */     int i = Constraints.getMinWidth-impl($this$isSatisfiedBy_u2d4WqzIAM), j = Constraints.getMaxWidth-impl($this$isSatisfiedBy_u2d4WqzIAM), k = IntSize.getWidth-impl(size);
/*     */     if ((i <= k) ? ((k <= j)) : false) {
/*     */       i = Constraints.getMinHeight-impl($this$isSatisfiedBy_u2d4WqzIAM);
/*     */       j = Constraints.getMaxHeight-impl($this$isSatisfiedBy_u2d4WqzIAM);
/*     */       k = IntSize.getHeight-impl(size);
/*     */       if ((i <= k) ? ((k <= j)) : false);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long offset-NN6Ew-U(long $this$offset_u2dNN6Ew_u2dU, int horizontal, int vertical) {
/*     */     return Constraints(RangesKt.coerceAtLeast(Constraints.getMinWidth-impl($this$offset_u2dNN6Ew_u2dU) + horizontal, 0), addMaxWithMinimum(Constraints.getMaxWidth-impl($this$offset_u2dNN6Ew_u2dU), horizontal), RangesKt.coerceAtLeast(Constraints.getMinHeight-impl($this$offset_u2dNN6Ew_u2dU) + vertical, 0), addMaxWithMinimum(Constraints.getMaxHeight-impl($this$offset_u2dNN6Ew_u2dU), vertical));
/*     */   }
/*     */   
/*     */   private static final int addMaxWithMinimum(int max, int value) {
/*     */     return (max == Integer.MAX_VALUE) ? max : RangesKt.coerceAtLeast(max + value, 0);
/*     */   }
/*     */   
/*     */   private static final int indexToBitOffset(int index) {
/*     */     int $i$f$indexToBitOffset = 0;
/*     */     return ((index & 0x1) << 1) + ((index & 0x2) >> 1) * 3;
/*     */   }
/*     */   
/*     */   private static final int minHeightOffsets(int bitOffset) {
/*     */     int $i$f$minHeightOffsets = 0;
/*     */     return 15 + bitOffset;
/*     */   }
/*     */   
/*     */   private static final int widthMask(int bitOffset) {
/*     */     int $i$f$widthMask = 0;
/*     */     return (1 << 13 + bitOffset) - 1;
/*     */   }
/*     */   
/*     */   private static final int heightMask(int bitOffset) {
/*     */     int $i$f$heightMask = 0;
/*     */     return (1 << 18 - bitOffset) - 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\ConstraintsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */