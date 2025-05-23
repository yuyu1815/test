/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import androidx.compose.runtime.State;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.jewel.bridge.SwingBridgeService;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\032 \020\006\032\0020\0072\021\020\b\032\r\022\004\022\0020\0070\t¢\006\002\b\nH\007¢\006\002\020\013\"\033\020\000\032\0020\0018BX\002¢\006\f\n\004\b\004\020\005\032\004\b\002\020\003¨\006\f²\006\n\020\r\032\0020\016X\002"}, d2 = {"bridgeService", "Lorg/jetbrains/jewel/bridge/SwingBridgeService;", "getBridgeService", "()Lorg/jetbrains/jewel/bridge/SwingBridgeService;", "bridgeService$delegate", "Lkotlin/Lazy;", "SwingBridgeTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ide-laf-bridge", "themeData", "Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;"})
/*    */ @SourceDebugExtension({"SMAP\nSwingBridgeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,39:1\n81#2:40\n*S KotlinDebug\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt\n*L\n23#1:40\n*E\n"})
/*    */ public final class SwingBridgeThemeKt {
/*    */   @NotNull
/* 18 */   private static final Lazy bridgeService$delegate = LazyKt.lazy(SwingBridgeThemeKt::bridgeService_delegate$lambda$0); private static final SwingBridgeService getBridgeService() { Lazy lazy = bridgeService$delegate; return (SwingBridgeService)lazy.getValue(); } private static final SwingBridgeService bridgeService_delegate$lambda$0() { return new SwingBridgeService(); }
/*    */   @ExperimentalJewelApi @Composable
/*    */   @ComposableInferredTarget(scheme = "[0[0]]")
/*    */   public static final void SwingBridgeTheme(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'content'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 1181742540
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_1
/*    */     //   15: iload_2
/*    */     //   16: istore_3
/*    */     //   17: iload_2
/*    */     //   18: bipush #6
/*    */     //   20: iand
/*    */     //   21: ifne -> 42
/*    */     //   24: iload_3
/*    */     //   25: aload_1
/*    */     //   26: aload_0
/*    */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_4
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_2
/*    */     //   40: ior
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: iconst_3
/*    */     //   44: iand
/*    */     //   45: iconst_2
/*    */     //   46: if_icmpne -> 58
/*    */     //   49: aload_1
/*    */     //   50: invokeinterface getSkipping : ()Z
/*    */     //   55: ifne -> 153
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc 1181742540
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'org.jetbrains.jewel.bridge.theme.SwingBridgeTheme (SwingBridgeTheme.kt:21)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: invokestatic getBridgeService : ()Lorg/jetbrains/jewel/bridge/SwingBridgeService;
/*    */     //   76: invokevirtual getCurrentBridgeThemeData$ide_laf_bridge : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   79: aconst_null
/*    */     //   80: aload_1
/*    */     //   81: iconst_0
/*    */     //   82: iconst_1
/*    */     //   83: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*    */     //   86: astore #4
/*    */     //   88: aload #4
/*    */     //   90: invokestatic SwingBridgeTheme$lambda$1 : (Landroidx/compose/runtime/State;)Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;
/*    */     //   93: invokevirtual getThemeDefinition : ()Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;
/*    */     //   96: getstatic org/jetbrains/jewel/ui/ComponentStyling.Companion : Lorg/jetbrains/jewel/ui/ComponentStyling$Companion;
/*    */     //   99: aload #4
/*    */     //   101: invokestatic SwingBridgeTheme$lambda$1 : (Landroidx/compose/runtime/State;)Lorg/jetbrains/jewel/bridge/SwingBridgeService$BridgeThemeData;
/*    */     //   104: invokevirtual getComponentStyling : ()Lorg/jetbrains/jewel/ui/ComponentStyling;
/*    */     //   107: invokevirtual with : (Lorg/jetbrains/jewel/ui/ComponentStyling;)Lorg/jetbrains/jewel/ui/ComponentStyling;
/*    */     //   110: iconst_1
/*    */     //   111: ldc -403644589
/*    */     //   113: iconst_1
/*    */     //   114: new org/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt$SwingBridgeTheme$1
/*    */     //   117: dup
/*    */     //   118: aload #4
/*    */     //   120: aload_0
/*    */     //   121: invokespecial <init> : (Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;)V
/*    */     //   124: aload_1
/*    */     //   125: bipush #54
/*    */     //   127: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   130: checkcast kotlin/jvm/functions/Function2
/*    */     //   133: aload_1
/*    */     //   134: sipush #3456
/*    */     //   137: iconst_0
/*    */     //   138: invokestatic BaseJewelTheme : (Lorg/jetbrains/jewel/foundation/theme/ThemeDefinition;Lorg/jetbrains/jewel/ui/ComponentStyling;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   141: invokestatic isTraceInProgress : ()Z
/*    */     //   144: ifeq -> 159
/*    */     //   147: invokestatic traceEventEnd : ()V
/*    */     //   150: goto -> 159
/*    */     //   153: aload_1
/*    */     //   154: invokeinterface skipToGroupEnd : ()V
/*    */     //   159: aload_1
/*    */     //   160: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   165: dup
/*    */     //   166: ifnull -> 184
/*    */     //   169: aload_0
/*    */     //   170: iload_2
/*    */     //   171: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*    */     //   176: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   181: goto -> 185
/*    */     //   184: pop
/*    */     //   185: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 6
/*    */     //   #23	-> 73
/*    */     //   #26	-> 88
/*    */     //   #27	-> 96
/*    */     //   #28	-> 110
/*    */     //   #29	-> 111
/*    */     //   #25	-> 138
/*    */     //   #38	-> 153
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   88	62	4	themeData$delegate	Landroidx/compose/runtime/State;
/*    */     //   17	169	3	$dirty	I
/*    */     //   0	186	0	content	Lkotlin/jvm/functions/Function2;
/*    */     //   0	186	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	186	2	$changed	I }
/*    */   private static final Unit SwingBridgeTheme$lambda$2(Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) { SwingBridgeTheme($content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/* 23 */     return Unit.INSTANCE; } private static final SwingBridgeService.BridgeThemeData SwingBridgeTheme$lambda$1(State $themeData$delegate) { State state = $themeData$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
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
/* 40 */       (SwingBridgeService.BridgeThemeData)state.getValue(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nSwingBridgeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt$SwingBridgeTheme$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n77#2:40\n*S KotlinDebug\n*F\n+ 1 SwingBridgeTheme.kt\norg/jetbrains/jewel/bridge/theme/SwingBridgeThemeKt$SwingBridgeTheme$1\n*L\n33#1:40\n*E\n"}) static final class SwingBridgeThemeKt$SwingBridgeTheme$1 implements Function2<Composer, Integer, Unit> { @Composable public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-403644589, $changed, -1, "org.jetbrains.jewel.bridge.theme.SwingBridgeTheme.<anonymous> (SwingBridgeTheme.kt:29)");  ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[3]; arrayOfProvidedValue[0] = PainterHintsProviderKt.getLocalPainterHintsProvider().provides(BridgePainterHintsProvider.Companion.invoke(SwingBridgeThemeKt.SwingBridgeTheme$lambda$1(this.$themeData$delegate).getThemeDefinition().isDark())); arrayOfProvidedValue[1] = NewUiCheckerKt.getLocalNewUiChecker().provides(BridgeNewUiChecker.INSTANCE); CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); arrayOfProvidedValue[2] = CompositionLocalsKt.getLocalDensity().provides(BridgeUtilsKt.scaleDensityWithIdeScale((Density)object));
/*    */         CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(1920246803, true, new Function2<Composer, Integer, Unit>(this.$content) {
/*    */                 @Composable
/*    */                 public final void invoke(Composer $composer, int $changed) {
/*    */                   if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */                     if (ComposerKt.isTraceInProgress())
/*    */                       ComposerKt.traceEventStart(1920246803, $changed, -1, "org.jetbrains.jewel.bridge.theme.SwingBridgeTheme.<anonymous>.<anonymous> (SwingBridgeTheme.kt:34)"); 
/*    */                     this.$content.invoke($composer, Integer.valueOf(0));
/*    */                     if (ComposerKt.isTraceInProgress())
/*    */                       ComposerKt.traceEventEnd(); 
/*    */                   } else {
/*    */                     $composer.skipToGroupEnd();
/*    */                   } 
/*    */                 }
/*    */               }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     SwingBridgeThemeKt$SwingBridgeTheme$1(State<SwingBridgeService.BridgeThemeData> $themeData$delegate, Function2<Composer, Integer, Unit> $content) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\SwingBridgeThemeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */