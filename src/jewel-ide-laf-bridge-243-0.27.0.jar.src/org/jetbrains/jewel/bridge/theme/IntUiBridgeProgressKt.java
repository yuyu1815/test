/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSizeKt;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.CircularProgressStyle;
/*    */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.HorizontalProgressBarStyle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\b\020\004\032\0020\005H\000¨\006\006"}, d2 = {"readCircularProgressStyle", "Lorg/jetbrains/jewel/ui/component/styling/CircularProgressStyle;", "isDark", "", "readHorizontalProgressBarStyle", "Lorg/jetbrains/jewel/ui/component/styling/HorizontalProgressBarStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeProgress.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeProgressKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,43:1\n708#2:44\n696#2:45\n149#3:46\n149#3:47\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeProgress.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeProgressKt\n*L\n18#1:44\n18#1:45\n35#1:46\n39#1:47\n*E\n"})
/*    */ public final class IntUiBridgeProgressKt
/*    */ {
/*    */   @NotNull
/*    */   public static final CircularProgressStyle readCircularProgressStyle(boolean isDark) {
/*    */     // Byte code:
/*    */     //   0: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */     //   3: pop
/*    */     //   4: bipush #125
/*    */     //   6: getstatic kotlin/time/DurationUnit.MILLISECONDS : Lkotlin/time/DurationUnit;
/*    */     //   9: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */     //   12: ldc 'ProgressIcon.color'
/*    */     //   14: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
/*    */     //   17: lstore_1
/*    */     //   18: iconst_0
/*    */     //   19: istore_3
/*    */     //   20: lload_1
/*    */     //   21: lstore #4
/*    */     //   23: iconst_0
/*    */     //   24: istore #6
/*    */     //   26: lload #4
/*    */     //   28: ldc2_w 16
/*    */     //   31: lcmp
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_1
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_0
/*    */     //   40: ifeq -> 47
/*    */     //   43: lload_1
/*    */     //   44: goto -> 78
/*    */     //   47: lstore #8
/*    */     //   49: iconst_0
/*    */     //   50: istore #7
/*    */     //   52: iload_0
/*    */     //   53: ifeq -> 65
/*    */     //   56: ldc2_w 4285494138
/*    */     //   59: invokestatic Color : (J)J
/*    */     //   62: goto -> 71
/*    */     //   65: ldc2_w 4289244605
/*    */     //   68: invokestatic Color : (J)J
/*    */     //   71: lstore #10
/*    */     //   73: lload #8
/*    */     //   75: lload #10
/*    */     //   77: nop
/*    */     //   78: aconst_null
/*    */     //   79: astore #12
/*    */     //   81: lstore #13
/*    */     //   83: lstore #15
/*    */     //   85: new org/jetbrains/jewel/ui/component/styling/CircularProgressStyle
/*    */     //   88: dup
/*    */     //   89: lload #15
/*    */     //   91: lload #13
/*    */     //   93: aload #12
/*    */     //   95: invokespecial <init> : (JJLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   98: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 0
/*    */     //   #16	-> 0
/*    */     //   #18	-> 12
/*    */     //   #44	-> 20
/*    */     //   #45	-> 26
/*    */     //   #44	-> 40
/*    */     //   #19	-> 52
/*    */     //   #44	-> 77
/*    */     //   #15	-> 79
/*    */     //   #21	-> 98
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   52	19	7	$i$a$-takeOrElse-DxMtmZc-IntUiBridgeProgressKt$readCircularProgressStyle$1	I
/*    */     //   26	14	6	$i$f$isSpecified-8_81llA	I
/*    */     //   23	17	4	$this$isSpecified$iv$iv	J
/*    */     //   20	58	3	$i$f$takeOrElse-DxMtmZc	I
/*    */     //   18	60	1	$this$takeOrElse_u2dDxMtmZc$iv	J
/*    */     //   0	99	0	isDark	Z
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final HorizontalProgressBarStyle readHorizontalProgressBarStyle() {
/* 35 */     int $this$dp$iv = 4, $i$f$getDp = 0;
/*    */ 
/*    */ 
/*    */     
/* 39 */     $this$dp$iv = 96; $i$f$getDp = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     return new HorizontalProgressBarStyle(new HorizontalProgressBarColors(BridgeUtilsKt.retrieveColorOrUnspecified("ProgressBar.trackColor"), BridgeUtilsKt.retrieveColorOrUnspecified("ProgressBar.progressColor"), BridgeUtilsKt.retrieveColorOrUnspecified("ProgressBar.indeterminateStartColor"), BridgeUtilsKt.retrieveColorOrUnspecified("ProgressBar.indeterminateEndColor"), null), new HorizontalProgressBarMetrics(CornerSizeKt.CornerSize(100), Dp.constructor-impl($this$dp$iv), 
/* 47 */           Dp.constructor-impl($this$dp$iv), null), DurationKt.toDuration(800, DurationUnit.MILLISECONDS), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeProgressKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */