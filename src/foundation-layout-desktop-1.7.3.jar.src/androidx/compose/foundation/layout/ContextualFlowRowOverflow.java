/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\004\b\007\030\000 \0222\0020\001:\001\022B\001\b\002\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\0220\b\002\020\007\032*\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\017\022\r\022\004\022\0020\0160\r¢\006\002\b\017\030\0010\b\0220\b\002\020\020\032*\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\017\022\r\022\004\022\0020\0160\r¢\006\002\b\017\030\0010\b¢\006\002\020\021¨\006\023"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "type", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "minLinesToShowCollapse", "", "minCrossAxisSizeToShowCollapse", "seeMoreGetter", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", "name", "state", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "collapseGetter", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "foundation-layout"})
/*     */ @ExperimentalLayoutApi
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ContextualFlowRowOverflow
/*     */   extends FlowLayoutOverflow
/*     */ {
/*     */   private ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse, Function1 seeMoreGetter, Function1 collapseGetter) {
/* 372 */     super(
/* 373 */         type, 
/* 374 */         minLinesToShowCollapse, 
/* 375 */         minCrossAxisSizeToShowCollapse, 
/* 376 */         seeMoreGetter, 
/* 377 */         collapseGetter, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J+\020\013\032\0020\0042\034\020\f\032\030\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020¢\006\002\b\021H\007¢\006\002\020\022Jb\020\023\032\0020\0042\034\020\013\032\030\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020¢\006\002\b\0212\034\020\024\032\030\022\004\022\0020\016\022\004\022\0020\0170\r¢\006\002\b\020¢\006\002\b\0212\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\030H\007ø\001\000¢\006\004\b\031\020\032R\034\020\003\032\0020\0048GX\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048GX\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;", "", "()V", "Clip", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "getClip$annotations", "getClip", "()Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Visible", "getVisible$annotations", "getVisible", "expandIndicator", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "expandOrCollapseIndicator", "collapseIndicator", "minRowsToShowCollapse", "", "minHeightToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "expandOrCollapseIndicator--jt2gSs", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "foundation-layout"})
/*     */   @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n149#2:907\n77#3:908\n1225#4,6:909\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion\n*L\n457#1:907\n459#1:908\n462#1:909,6\n*E\n"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @ExperimentalLayoutApi
/*     */     @NotNull
/*     */     public final ContextualFlowRowOverflow getVisible() {
/* 387 */       return ContextualFlowRowOverflow.Visible;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @ExperimentalLayoutApi
/*     */     @NotNull
/*     */     public final ContextualFlowRowOverflow getClip() {
/* 395 */       return ContextualFlowRowOverflow.Clip;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @ExperimentalLayoutApi
/*     */     @NotNull
/*     */     public final ContextualFlowRowOverflow expandIndicator(@NotNull Function3<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, Unit> content) {
/* 413 */       Intrinsics.checkNotNullParameter(content, "content"); Function1 seeMoreGetter = new ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1(content);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 419 */       return new ContextualFlowRowOverflow(
/* 420 */           FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, 
/* 421 */           seeMoreGetter, null, 22, null);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\r\022\004\022\0020\0020\001¢\006\002\b\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "invoke", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lkotlin/jvm/functions/Function2;"})
/*     */     static final class ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1
/*     */       extends Lambda
/*     */       implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>>
/*     */     {
/*     */       @NotNull
/*     */       public final Function2<Composer, Integer, Unit> invoke(@NotNull FlowLayoutOverflowState state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */         return (Function2<Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(1850548683, true, new Function2<Composer, Integer, Unit>(state, this.$content)
/*     */             {
/*     */               @Composable
/*     */               public final void invoke(@Nullable Composer $composer, int $changed) {
/*     */                 ComposerKt.sourceInformation($composer, "C415@17942L9:FlowLayoutOverflow.kt#2w3rfo");
/*     */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventStart(1850548683, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:414)"); 
/*     */                   ContextualFlowRowOverflowScopeImpl scope = new ContextualFlowRowOverflowScopeImpl(this.$state);
/*     */                   this.$content.invoke(scope, $composer, Integer.valueOf(0));
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventEnd(); 
/*     */                 } else {
/*     */                   $composer.skipToGroupEnd();
/*     */                 } 
/*     */               }
/*     */             });
/*     */       }
/*     */       
/*     */       ContextualFlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1(Function3<ContextualFlowRowOverflowScope, Composer, Integer, Unit> $content) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     @ExperimentalLayoutApi
/*     */     @Composable
/*     */     @NotNull
/*     */     public final ContextualFlowRowOverflow expandOrCollapseIndicator--jt2gSs(@NotNull Function3 expandIndicator, @NotNull Function3 collapseIndicator, int minRowsToShowCollapse, float minHeightToShowCollapse, @Nullable Composer $composer, int $changed, int param1Int1) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'expandIndicator'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'collapseIndicator'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload #5
/*     */       //   14: ldc 1435293820
/*     */       //   16: ldc 'C(expandOrCollapseIndicator)P(1!1,3,2:c#ui.unit.Dp)*458@20145L7,461@20241L1109:FlowLayoutOverflow.kt#2w3rfo'
/*     */       //   18: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   21: iload #7
/*     */       //   23: iconst_4
/*     */       //   24: iand
/*     */       //   25: ifeq -> 30
/*     */       //   28: iconst_1
/*     */       //   29: istore_3
/*     */       //   30: iload #7
/*     */       //   32: bipush #8
/*     */       //   34: iand
/*     */       //   35: ifeq -> 52
/*     */       //   38: iconst_0
/*     */       //   39: istore #8
/*     */       //   41: iconst_0
/*     */       //   42: istore #9
/*     */       //   44: iload #8
/*     */       //   46: i2f
/*     */       //   47: invokestatic constructor-impl : (F)F
/*     */       //   50: fstore #4
/*     */       //   52: invokestatic isTraceInProgress : ()Z
/*     */       //   55: ifeq -> 68
/*     */       //   58: ldc 1435293820
/*     */       //   60: iload #6
/*     */       //   62: iconst_m1
/*     */       //   63: ldc 'androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:457)'
/*     */       //   65: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   68: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */       //   71: checkcast androidx/compose/runtime/CompositionLocal
/*     */       //   74: astore #9
/*     */       //   76: iconst_0
/*     */       //   77: istore #10
/*     */       //   79: iconst_0
/*     */       //   80: istore #11
/*     */       //   82: aload #5
/*     */       //   84: ldc 2023513938
/*     */       //   86: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */       //   88: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   91: aload #5
/*     */       //   93: aload #9
/*     */       //   95: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */       //   100: astore #12
/*     */       //   102: aload #5
/*     */       //   104: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   107: aload #12
/*     */       //   109: checkcast androidx/compose/ui/unit/Density
/*     */       //   112: astore #10
/*     */       //   114: iconst_0
/*     */       //   115: istore #11
/*     */       //   117: aload #10
/*     */       //   119: fload #4
/*     */       //   121: invokeinterface roundToPx-0680j_4 : (F)I
/*     */       //   126: nop
/*     */       //   127: istore #8
/*     */       //   129: aload #5
/*     */       //   131: ldc 172958269
/*     */       //   133: ldc 'CC(remember):FlowLayoutOverflow.kt#9igjgp'
/*     */       //   135: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   138: aload #5
/*     */       //   140: astore #11
/*     */       //   142: iload #6
/*     */       //   144: sipush #896
/*     */       //   147: iand
/*     */       //   148: sipush #384
/*     */       //   151: ixor
/*     */       //   152: sipush #256
/*     */       //   155: if_icmple -> 169
/*     */       //   158: aload #5
/*     */       //   160: iload_3
/*     */       //   161: invokeinterface changed : (I)Z
/*     */       //   166: ifne -> 181
/*     */       //   169: iload #6
/*     */       //   171: sipush #384
/*     */       //   174: iand
/*     */       //   175: sipush #256
/*     */       //   178: if_icmpne -> 185
/*     */       //   181: iconst_1
/*     */       //   182: goto -> 186
/*     */       //   185: iconst_0
/*     */       //   186: aload #5
/*     */       //   188: iload #8
/*     */       //   190: invokeinterface changed : (I)Z
/*     */       //   195: ior
/*     */       //   196: iload #6
/*     */       //   198: bipush #14
/*     */       //   200: iand
/*     */       //   201: bipush #6
/*     */       //   203: ixor
/*     */       //   204: iconst_4
/*     */       //   205: if_icmple -> 219
/*     */       //   208: aload #5
/*     */       //   210: aload_1
/*     */       //   211: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   216: ifne -> 228
/*     */       //   219: iload #6
/*     */       //   221: bipush #6
/*     */       //   223: iand
/*     */       //   224: iconst_4
/*     */       //   225: if_icmpne -> 232
/*     */       //   228: iconst_1
/*     */       //   229: goto -> 233
/*     */       //   232: iconst_0
/*     */       //   233: ior
/*     */       //   234: iload #6
/*     */       //   236: bipush #112
/*     */       //   238: iand
/*     */       //   239: bipush #48
/*     */       //   241: ixor
/*     */       //   242: bipush #32
/*     */       //   244: if_icmple -> 258
/*     */       //   247: aload #5
/*     */       //   249: aload_2
/*     */       //   250: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   255: ifne -> 268
/*     */       //   258: iload #6
/*     */       //   260: bipush #48
/*     */       //   262: iand
/*     */       //   263: bipush #32
/*     */       //   265: if_icmpne -> 272
/*     */       //   268: iconst_1
/*     */       //   269: goto -> 273
/*     */       //   272: iconst_0
/*     */       //   273: ior
/*     */       //   274: istore #12
/*     */       //   276: nop
/*     */       //   277: iconst_0
/*     */       //   278: istore #13
/*     */       //   280: aload #11
/*     */       //   282: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   287: astore #14
/*     */       //   289: iconst_0
/*     */       //   290: istore #15
/*     */       //   292: iload #12
/*     */       //   294: ifne -> 308
/*     */       //   297: aload #14
/*     */       //   299: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   302: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   305: if_acmpne -> 371
/*     */       //   308: iconst_0
/*     */       //   309: istore #16
/*     */       //   311: new androidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
/*     */       //   314: dup
/*     */       //   315: aload_1
/*     */       //   316: invokespecial <init> : (Lkotlin/jvm/functions/Function3;)V
/*     */       //   319: checkcast kotlin/jvm/functions/Function1
/*     */       //   322: astore #17
/*     */       //   324: new androidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
/*     */       //   327: dup
/*     */       //   328: aload_2
/*     */       //   329: invokespecial <init> : (Lkotlin/jvm/functions/Function3;)V
/*     */       //   332: checkcast kotlin/jvm/functions/Function1
/*     */       //   335: astore #18
/*     */       //   337: new androidx/compose/foundation/layout/ContextualFlowRowOverflow
/*     */       //   340: dup
/*     */       //   341: getstatic androidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator : Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;
/*     */       //   344: iload_3
/*     */       //   345: iload #8
/*     */       //   347: aload #17
/*     */       //   349: aload #18
/*     */       //   351: aconst_null
/*     */       //   352: invokespecial <init> : (Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   355: astore #19
/*     */       //   357: aload #11
/*     */       //   359: aload #19
/*     */       //   361: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   366: aload #19
/*     */       //   368: goto -> 373
/*     */       //   371: aload #14
/*     */       //   373: nop
/*     */       //   374: nop
/*     */       //   375: nop
/*     */       //   376: checkcast androidx/compose/foundation/layout/ContextualFlowRowOverflow
/*     */       //   379: astore #10
/*     */       //   381: aload #5
/*     */       //   383: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   386: aload #10
/*     */       //   388: astore #9
/*     */       //   390: invokestatic isTraceInProgress : ()Z
/*     */       //   393: ifeq -> 399
/*     */       //   396: invokestatic traceEventEnd : ()V
/*     */       //   399: aload #5
/*     */       //   401: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   404: aload #9
/*     */       //   406: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #458	-> 18
/*     */       //   #456	-> 28
/*     */       //   #457	-> 38
/*     */       //   #907	-> 44
/*     */       //   #458	-> 65
/*     */       //   #459	-> 68
/*     */       //   #908	-> 88
/*     */       //   #459	-> 109
/*     */       //   #460	-> 117
/*     */       //   #459	-> 126
/*     */       //   #459	-> 127
/*     */       //   #462	-> 135
/*     */       //   #463	-> 160
/*     */       //   #464	-> 188
/*     */       //   #465	-> 210
/*     */       //   #466	-> 249
/*     */       //   #462	-> 276
/*     */       //   #909	-> 280
/*     */       //   #910	-> 292
/*     */       //   #911	-> 308
/*     */       //   #468	-> 311
/*     */       //   #475	-> 324
/*     */       //   #482	-> 337
/*     */       //   #483	-> 341
/*     */       //   #484	-> 344
/*     */       //   #485	-> 345
/*     */       //   #486	-> 347
/*     */       //   #487	-> 349
/*     */       //   #482	-> 352
/*     */       //   #911	-> 355
/*     */       //   #912	-> 357
/*     */       //   #913	-> 366
/*     */       //   #914	-> 371
/*     */       //   #910	-> 373
/*     */       //   #909	-> 374
/*     */       //   #909	-> 375
/*     */       //   #462	-> 376
/*     */       //   #458	-> 401
/*     */       //   #462	-> 406
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	6	9	$i$f$getDp	I
/*     */       //   41	9	8	$this$dp$iv	I
/*     */       //   82	27	11	$i$f$getCurrent	I
/*     */       //   79	30	9	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */       //   79	30	10	$changed$iv	I
/*     */       //   117	9	11	$i$a$-with-ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$minHeightToShowCollapsePx$1	I
/*     */       //   114	12	10	$this$expandOrCollapseIndicator__jt2gSs_u24lambda_u240	Landroidx/compose/ui/unit/Density;
/*     */       //   311	44	16	$i$a$-cache-ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1	I
/*     */       //   324	31	17	seeMoreGetter	Lkotlin/jvm/functions/Function1;
/*     */       //   337	18	18	collapseGetter	Lkotlin/jvm/functions/Function1;
/*     */       //   357	11	19	value$iv	Ljava/lang/Object;
/*     */       //   292	82	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   289	85	14	it$iv	Ljava/lang/Object;
/*     */       //   280	96	13	$i$f$cache	I
/*     */       //   277	99	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   277	99	12	invalid$iv	Z
/*     */       //   129	278	8	minHeightToShowCollapsePx	I
/*     */       //   0	407	0	this	Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;
/*     */       //   0	407	1	expandIndicator	Lkotlin/jvm/functions/Function3;
/*     */       //   0	407	2	collapseIndicator	Lkotlin/jvm/functions/Function3;
/*     */       //   0	407	3	minRowsToShowCollapse	I
/*     */       //   0	407	4	minHeightToShowCollapse	F
/*     */       //   0	407	5	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	407	6	$changed	I
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\r\022\004\022\0020\0020\001¢\006\002\b\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "invoke", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lkotlin/jvm/functions/Function2;"})
/*     */     static final class ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
/*     */       extends Lambda
/*     */       implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>>
/*     */     {
/*     */       @NotNull
/* 469 */       public final Function2<Composer, Integer, Unit> invoke(@NotNull FlowLayoutOverflowState state) { Intrinsics.checkNotNullParameter(state, "state"); return (Function2<Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(897838875, true, new Function2<Composer, Integer, Unit>(state, this.$expandIndicator) { @Composable
/* 470 */               public final void invoke(@Nullable Composer $composer, int $changed) { ComposerKt.sourceInformation($composer, "C470@20630L17:FlowLayoutOverflow.kt#2w3rfo"); if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(897838875, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:469)");  ContextualFlowRowOverflowScopeImpl scope = new ContextualFlowRowOverflowScopeImpl(this.$state);
/* 471 */                   this.$expandIndicator.invoke(scope, $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */                  } }
/*     */           ); } ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1(Function3<ContextualFlowRowOverflowScope, Composer, Integer, Unit> $expandIndicator) { super(1); }
/*     */     } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\r\022\004\022\0020\0020\001¢\006\002\b\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "invoke", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)Lkotlin/jvm/functions/Function2;"})
/*     */     static final class ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1 extends Lambda implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>> { @NotNull
/* 476 */       public final Function2<Composer, Integer, Unit> invoke(@NotNull FlowLayoutOverflowState state) { Intrinsics.checkNotNullParameter(state, "state"); return (Function2<Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(307858874, true, new Function2<Composer, Integer, Unit>(state, this.$collapseIndicator) { @Composable
/* 477 */               public final void invoke(@Nullable Composer $composer, int $changed) { ComposerKt.sourceInformation($composer, "C477@20904L19:FlowLayoutOverflow.kt#2w3rfo"); if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(307858874, $changed, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:476)");  ContextualFlowRowOverflowScopeImpl scope = new ContextualFlowRowOverflowScopeImpl(this.$state);
/* 478 */                   this.$collapseIndicator.invoke(scope, $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */                  }
/*     */                }
/*     */           ); }
/*     */ 
/*     */       
/*     */       ContextualFlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1(Function3<ContextualFlowRowOverflowScope, Composer, Integer, Unit> $collapseIndicator) {
/*     */         super(1);
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final ContextualFlowRowOverflow Visible = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, 0, null, null, 30, null);
/*     */   @NotNull
/*     */   private static final ContextualFlowRowOverflow Clip = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, 0, 0, null, null, 30, null);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowRowOverflow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */