/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J&\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H\026ø\001\000¢\006\004\b\020\020\021R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\005\002\007\n\005\b¡\0360\001¨\006\022"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n460#1:485\n461#1:486\n462#1:487\n463#1:488\n*E\n"})
/*     */ final class PaddingValuesModifier
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   @NotNull
/*     */   private PaddingValues paddingValues;
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getPaddingValues() {
/* 453 */     return this.paddingValues; } public final void setPaddingValues(@NotNull PaddingValues <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.paddingValues = <set-?>; } public PaddingValuesModifier(@NotNull PaddingValues paddingValues) { this.paddingValues = paddingValues; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$measure'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurable'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   16: aload_1
/*     */     //   17: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   22: invokeinterface calculateLeftPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: iconst_0
/*     */     //   31: istore #6
/*     */     //   33: iload #5
/*     */     //   35: i2f
/*     */     //   36: invokestatic constructor-impl : (F)F
/*     */     //   39: invokestatic compareTo-0680j_4 : (FF)I
/*     */     //   42: iflt -> 136
/*     */     //   45: aload_0
/*     */     //   46: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   49: invokeinterface calculateTopPadding-D9Ej5fM : ()F
/*     */     //   54: iconst_0
/*     */     //   55: istore #5
/*     */     //   57: iconst_0
/*     */     //   58: istore #6
/*     */     //   60: iload #5
/*     */     //   62: i2f
/*     */     //   63: invokestatic constructor-impl : (F)F
/*     */     //   66: invokestatic compareTo-0680j_4 : (FF)I
/*     */     //   69: iflt -> 136
/*     */     //   72: aload_0
/*     */     //   73: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   76: aload_1
/*     */     //   77: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   82: invokeinterface calculateRightPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iconst_0
/*     */     //   91: istore #6
/*     */     //   93: iload #5
/*     */     //   95: i2f
/*     */     //   96: invokestatic constructor-impl : (F)F
/*     */     //   99: invokestatic compareTo-0680j_4 : (FF)I
/*     */     //   102: iflt -> 136
/*     */     //   105: aload_0
/*     */     //   106: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   109: invokeinterface calculateBottomPadding-D9Ej5fM : ()F
/*     */     //   114: iconst_0
/*     */     //   115: istore #5
/*     */     //   117: iconst_0
/*     */     //   118: istore #6
/*     */     //   120: iload #5
/*     */     //   122: i2f
/*     */     //   123: invokestatic constructor-impl : (F)F
/*     */     //   126: invokestatic compareTo-0680j_4 : (FF)I
/*     */     //   129: iflt -> 136
/*     */     //   132: iconst_1
/*     */     //   133: goto -> 137
/*     */     //   136: iconst_0
/*     */     //   137: ifne -> 160
/*     */     //   140: iconst_0
/*     */     //   141: istore #6
/*     */     //   143: ldc 'Padding must be non-negative'
/*     */     //   145: astore #6
/*     */     //   147: new java/lang/IllegalArgumentException
/*     */     //   150: dup
/*     */     //   151: aload #6
/*     */     //   153: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   156: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   159: athrow
/*     */     //   160: aload_1
/*     */     //   161: aload_0
/*     */     //   162: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   165: aload_1
/*     */     //   166: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   171: invokeinterface calculateLeftPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   176: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   181: aload_1
/*     */     //   182: aload_0
/*     */     //   183: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   186: aload_1
/*     */     //   187: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   192: invokeinterface calculateRightPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   197: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   202: iadd
/*     */     //   203: istore #5
/*     */     //   205: aload_1
/*     */     //   206: aload_0
/*     */     //   207: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   210: invokeinterface calculateTopPadding-D9Ej5fM : ()F
/*     */     //   215: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   220: aload_1
/*     */     //   221: aload_0
/*     */     //   222: getfield paddingValues : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   225: invokeinterface calculateBottomPadding-D9Ej5fM : ()F
/*     */     //   230: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   235: iadd
/*     */     //   236: istore #6
/*     */     //   238: aload_2
/*     */     //   239: lload_3
/*     */     //   240: iload #5
/*     */     //   242: ineg
/*     */     //   243: iload #6
/*     */     //   245: ineg
/*     */     //   246: invokestatic offset-NN6Ew-U : (JII)J
/*     */     //   249: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   254: astore #7
/*     */     //   256: lload_3
/*     */     //   257: aload #7
/*     */     //   259: invokevirtual getWidth : ()I
/*     */     //   262: iload #5
/*     */     //   264: iadd
/*     */     //   265: invokestatic constrainWidth-K40F9xA : (JI)I
/*     */     //   268: istore #8
/*     */     //   270: lload_3
/*     */     //   271: aload #7
/*     */     //   273: invokevirtual getHeight : ()I
/*     */     //   276: iload #6
/*     */     //   278: iadd
/*     */     //   279: invokestatic constrainHeight-K40F9xA : (JI)I
/*     */     //   282: istore #9
/*     */     //   284: aload_1
/*     */     //   285: iload #8
/*     */     //   287: iload #9
/*     */     //   289: aconst_null
/*     */     //   290: new androidx/compose/foundation/layout/PaddingValuesModifier$measure$2
/*     */     //   293: dup
/*     */     //   294: aload #7
/*     */     //   296: aload_1
/*     */     //   297: aload_0
/*     */     //   298: invokespecial <init> : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/PaddingValuesModifier;)V
/*     */     //   301: checkcast kotlin/jvm/functions/Function1
/*     */     //   304: iconst_4
/*     */     //   305: aconst_null
/*     */     //   306: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   309: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #460	-> 12
/*     */     //   #485	-> 33
/*     */     //   #460	-> 39
/*     */     //   #461	-> 45
/*     */     //   #486	-> 60
/*     */     //   #461	-> 66
/*     */     //   #462	-> 72
/*     */     //   #487	-> 93
/*     */     //   #462	-> 99
/*     */     //   #463	-> 105
/*     */     //   #488	-> 120
/*     */     //   #463	-> 126
/*     */     //   #459	-> 137
/*     */     //   #465	-> 143
/*     */     //   #459	-> 145
/*     */     //   #467	-> 160
/*     */     //   #468	-> 181
/*     */     //   #467	-> 202
/*     */     //   #469	-> 205
/*     */     //   #470	-> 220
/*     */     //   #469	-> 235
/*     */     //   #472	-> 238
/*     */     //   #474	-> 256
/*     */     //   #475	-> 270
/*     */     //   #476	-> 284
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	6	6	$i$f$getDp	I
/*     */     //   30	9	5	$this$dp$iv	I
/*     */     //   60	6	6	$i$f$getDp	I
/*     */     //   57	9	5	$this$dp$iv	I
/*     */     //   93	6	6	$i$f$getDp	I
/*     */     //   90	9	5	$this$dp$iv	I
/*     */     //   120	6	6	$i$f$getDp	I
/*     */     //   117	9	5	$this$dp$iv	I
/*     */     //   143	2	6	$i$a$-require-PaddingValuesModifier$measure$1	I
/*     */     //   205	105	5	horizontal	I
/*     */     //   238	72	6	vertical	I
/*     */     //   256	54	7	placeable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   270	40	8	width	I
/*     */     //   284	26	9	height	I
/*     */     //   0	310	0	this	Landroidx/compose/foundation/layout/PaddingValuesModifier;
/*     */     //   0	310	1	$this$measure_u2d3p2s80s	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	310	2	measurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   0	310	3	constraints	J
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class PaddingValuesModifier$measure$2
/*     */     extends Lambda
/*     */     implements Function1<Placeable.PlacementScope, Unit>
/*     */   {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/* 477 */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.place$default($this$layout, this.$placeable, 
/* 478 */           this.$this_measure.roundToPx-0680j_4(PaddingValuesModifier.this.getPaddingValues().calculateLeftPadding-u2uoSUM(this.$this_measure.getLayoutDirection())), 
/* 479 */           this.$this_measure.roundToPx-0680j_4(PaddingValuesModifier.this.getPaddingValues().calculateTopPadding-D9Ej5fM()), 0.0F, 4, null);
/*     */     }
/*     */     
/*     */     PaddingValuesModifier$measure$2(MeasureScope $receiver, PaddingValuesModifier paddingValuesModifier) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\PaddingValuesModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */