/*     */ package org.jetbrains.jewel.bridge;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidedValue;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.awt.ComposePanel;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.actionSystem.ComponentDataProviderBridgeKt;
/*     */ import org.jetbrains.jewel.bridge.theme.SwingBridgeThemeKt;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\0329\020\000\032\0020\0012\031\b\002\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\0062\021\020\007\032\r\022\004\022\0020\0050\b¢\006\002\b\t¢\006\002\020\n\032;\020\013\032\0020\0012\031\b\002\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\0062\021\020\007\032\r\022\004\022\0020\0050\b¢\006\002\b\tH\007¢\006\002\020\n\032;\020\f\032\0020\0012\031\b\002\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\0062\021\020\007\032\r\022\004\022\0020\0050\b¢\006\002\b\tH\007¢\006\002\020\n\032;\020\r\032\0020\0012\031\b\002\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\0062\021\020\007\032\r\022\004\022\0020\0050\b¢\006\002\b\tH\007¢\006\002\020\n\032'\020\016\032\0020\0172\035\020\002\032\031\022\004\022\0020\004\022\004\022\0020\017\022\004\022\0020\0050\020¢\006\002\b\006H\002\032 \020\027\032\0020\0052\021\020\007\032\r\022\004\022\0020\0050\b¢\006\002\b\tH\003¢\006\002\020\030\"\"\020\021\032\b\022\004\022\0020\0010\0228\006X\004¢\006\016\n\000\022\004\b\023\020\024\032\004\b\025\020\026¨\006\031"}, d2 = {"JewelComposePanel", "Ljavax/swing/JComponent;", "config", "Lkotlin/Function1;", "Landroidx/compose/ui/awt/ComposePanel;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljavax/swing/JComponent;", "JewelToolWindowComposePanel", "JewelComposeNoThemePanel", "JewelToolWindowNoThemeComposePanel", "createJewelComposePanel", "Lorg/jetbrains/jewel/bridge/JewelComposePanel;", "Lkotlin/Function2;", "LocalComponent", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalComponent$annotations", "()V", "getLocalComponent", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Compose17IJSizeBugWorkaround", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nJewelComposePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JewelComposePanel.kt\norg/jetbrains/jewel/bridge/JewelComposePanelKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,115:1\n77#2:116\n77#2:117\n71#3:118\n68#3,6:119\n74#3:153\n78#3:157\n79#4,6:125\n86#4,4:140\n90#4,2:150\n94#4:156\n368#5,9:131\n377#5:152\n378#5,2:154\n4034#6,6:144\n*S KotlinDebug\n*F\n+ 1 JewelComposePanel.kt\norg/jetbrains/jewel/bridge/JewelComposePanelKt\n*L\n111#1:116\n112#1:117\n112#1:118\n112#1:119,6\n112#1:153\n112#1:157\n112#1:125,6\n112#1:140,4\n112#1:150,2\n112#1:156\n112#1:131,9\n112#1:152\n112#1:154,2\n112#1:144,6\n*E\n"})
/*     */ public final class JewelComposePanelKt {
/*  25 */   private static final Unit JewelComposePanel$lambda$0(ComposePanel <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") @NotNull
/*     */   public static final JComponent JewelComposePanel(@NotNull Function1 config, @NotNull Function2 content) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'config'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
/*     */     //   19: invokestatic createJewelComposePanel : (Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/bridge/JewelComposePanel;
/*     */     //   22: checkcast javax/swing/JComponent
/*     */     //   25: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 12
/*     */     //   #35	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	config	Lkotlin/jvm/functions/Function1;
/*     */     //   0	26	1	content	Lkotlin/jvm/functions/Function2; }
/*  27 */   private static final Unit JewelComposePanel$lambda$1(Function1 $config, Function2<? super Composer, ? super Integer, Unit> $content, ComposePanel $this$createJewelComposePanel, JewelComposePanel jewelPanel) { Intrinsics.checkNotNullParameter($this$createJewelComposePanel, "$this$createJewelComposePanel"); Intrinsics.checkNotNullParameter(jewelPanel, "jewelPanel"); $config.invoke($this$createJewelComposePanel);
/*  28 */     $this$createJewelComposePanel.setContent((Function2)ComposableLambdaKt.composableLambdaInstance(2076420654, true, new JewelComposePanelKt$JewelComposePanel$2$1($this$createJewelComposePanel, jewelPanel, $content)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class JewelComposePanelKt$JewelComposePanel$2$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2076420654, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposePanel.<anonymous>.<anonymous> (JewelComposePanel.kt:28)");  SwingBridgeThemeKt.SwingBridgeTheme((Function2)ComposableLambdaKt.rememberComposableLambda(51221343, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(51221343, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:29)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(83879583, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(83879583, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:30)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */                           $composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */               $composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } JewelComposePanelKt$JewelComposePanel$2$1(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {} }
/*  40 */   private static final Unit JewelToolWindowComposePanel$lambda$2(ComposePanel <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*     */   @InternalJewelApi @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   @NotNull
/*     */   public static final JComponent JewelToolWindowComposePanel(@NotNull Function1 config, @NotNull Function2 content) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'config'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
/*     */     //   19: invokestatic createJewelComposePanel : (Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/bridge/JewelComposePanel;
/*     */     //   22: checkcast javax/swing/JComponent
/*     */     //   25: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #42	-> 12
/*     */     //   #53	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	config	Lkotlin/jvm/functions/Function1;
/*  43 */     //   0	26	1	content	Lkotlin/jvm/functions/Function2; } private static final Unit JewelToolWindowComposePanel$lambda$3(Function1 $config, Function2<? super Composer, ? super Integer, Unit> $content, ComposePanel $this$createJewelComposePanel, JewelComposePanel jewelPanel) { Intrinsics.checkNotNullParameter($this$createJewelComposePanel, "$this$createJewelComposePanel"); Intrinsics.checkNotNullParameter(jewelPanel, "jewelPanel"); $config.invoke($this$createJewelComposePanel);
/*  44 */     $this$createJewelComposePanel.setContent((Function2)ComposableLambdaKt.composableLambdaInstance(2146110070, true, new JewelComposePanelKt$JewelToolWindowComposePanel$2$1($this$createJewelComposePanel, jewelPanel, $content)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class JewelComposePanelKt$JewelToolWindowComposePanel$2$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2146110070, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous> (JewelComposePanel.kt:44)");  JewelComposePanelKt.Compose17IJSizeBugWorkaround((Function2)ComposableLambdaKt.rememberComposableLambda(29922865, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(29922865, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:45)");  SwingBridgeThemeKt.SwingBridgeTheme((Function2)ComposableLambdaKt.rememberComposableLambda(1452848738, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1452848738, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:46)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(1432996258, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1432996258, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:47)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */                                       $composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */                           $composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*  57 */               $composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } JewelComposePanelKt$JewelToolWindowComposePanel$2$1(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {} } private static final Unit JewelComposeNoThemePanel$lambda$4(ComposePanel <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @ExperimentalJewelApi @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") @NotNull
/*     */   public static final JComponent JewelComposeNoThemePanel(@NotNull Function1 config, @NotNull Function2 content) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'config'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
/*     */     //   19: invokestatic createJewelComposePanel : (Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/bridge/JewelComposePanel;
/*     */     //   22: checkcast javax/swing/JComponent
/*     */     //   25: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 12
/*     */     //   #65	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	config	Lkotlin/jvm/functions/Function1;
/*     */     //   0	26	1	content	Lkotlin/jvm/functions/Function2; }
/*  59 */   private static final Unit JewelComposeNoThemePanel$lambda$5(Function1 $config, Function2<? super Composer, ? super Integer, Unit> $content, ComposePanel $this$createJewelComposePanel, JewelComposePanel jewelPanel) { Intrinsics.checkNotNullParameter($this$createJewelComposePanel, "$this$createJewelComposePanel"); Intrinsics.checkNotNullParameter(jewelPanel, "jewelPanel"); $config.invoke($this$createJewelComposePanel);
/*  60 */     $this$createJewelComposePanel.setContent((Function2)ComposableLambdaKt.composableLambdaInstance(1719544046, true, new JewelComposePanelKt$JewelComposeNoThemePanel$2$1($this$createJewelComposePanel, jewelPanel, $content)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class JewelComposePanelKt$JewelComposeNoThemePanel$2$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1719544046, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposeNoThemePanel.<anonymous>.<anonymous> (JewelComposePanel.kt:60)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(1489132974, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1489132974, $changed, -1, "org.jetbrains.jewel.bridge.JewelComposeNoThemePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:61)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress())
/*     */                       ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */               $composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } JewelComposePanelKt$JewelComposeNoThemePanel$2$1(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {} }
/*  70 */   private static final Unit JewelToolWindowNoThemeComposePanel$lambda$6(ComposePanel <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; } @ExperimentalJewelApi @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   @NotNull
/*     */   public static final JComponent JewelToolWindowNoThemeComposePanel(@NotNull Function1 config, @NotNull Function2 content) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'config'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'content'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;
/*     */     //   19: invokestatic createJewelComposePanel : (Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/jewel/bridge/JewelComposePanel;
/*     */     //   22: checkcast javax/swing/JComponent
/*     */     //   25: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 12
/*     */     //   #81	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	26	0	config	Lkotlin/jvm/functions/Function1;
/*     */     //   0	26	1	content	Lkotlin/jvm/functions/Function2; }
/*  73 */   private static final Unit JewelToolWindowNoThemeComposePanel$lambda$7(Function1 $config, Function2<? super Composer, ? super Integer, Unit> $content, ComposePanel $this$createJewelComposePanel, JewelComposePanel jewelPanel) { Intrinsics.checkNotNullParameter($this$createJewelComposePanel, "$this$createJewelComposePanel"); Intrinsics.checkNotNullParameter(jewelPanel, "jewelPanel"); $config.invoke($this$createJewelComposePanel);
/*  74 */     $this$createJewelComposePanel.setContent((Function2)ComposableLambdaKt.composableLambdaInstance(872316882, true, new JewelComposePanelKt$JewelToolWindowNoThemeComposePanel$2$1($this$createJewelComposePanel, jewelPanel, $content)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class JewelComposePanelKt$JewelToolWindowNoThemeComposePanel$2$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(872316882, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowNoThemeComposePanel.<anonymous>.<anonymous> (JewelComposePanel.kt:74)");  JewelComposePanelKt.Compose17IJSizeBugWorkaround((Function2)ComposableLambdaKt.rememberComposableLambda(1952078775, true, new Function2<Composer, Integer, Unit>(this.$this_createJewelComposePanel, this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1952078775, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowNoThemeComposePanel.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:75)");  CompositionLocalKt.CompositionLocalProvider(JewelComposePanelKt.getLocalComponent().provides(this.$this_createJewelComposePanel), (Function2)ComposableLambdaKt.rememberComposableLambda(1987563639, true, new Function2<Composer, Integer, Unit>(this.$jewelPanel, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1987563639, $changed, -1, "org.jetbrains.jewel.bridge.JewelToolWindowNoThemeComposePanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JewelComposePanel.kt:76)");  ComponentDataProviderBridgeKt.ComponentDataProviderBridge(this.$jewelPanel, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*     */                           $composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }
/*  84 */               $composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } JewelComposePanelKt$JewelToolWindowNoThemeComposePanel$2$1(ComposePanel $this_createJewelComposePanel, JewelComposePanel $jewelPanel, Function2<Composer, Integer, Unit> $content) {} } private static final JewelComposePanel createJewelComposePanel(Function2 config) { JewelComposePanel jewelPanel = new JewelComposePanel();
/*  85 */     jewelPanel.setLayout(new BorderLayout());
/*  86 */     ComposePanel composePanel = new ComposePanel();
/*  87 */     jewelPanel.add((Component)composePanel, "Center");
/*  88 */     config.invoke(composePanel, jewelPanel);
/*  89 */     return jewelPanel; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ProvidableCompositionLocal<JComponent> getLocalComponent()
/*     */   {
/* 100 */     return LocalComponent; } @NotNull
/* 101 */   private static final ProvidableCompositionLocal<JComponent> LocalComponent = CompositionLocalKt.staticCompositionLocalOf(JewelComposePanelKt::LocalComponent$lambda$8); private static final JComponent LocalComponent$lambda$8() {
/* 102 */     throw new IllegalStateException("CompositionLocal LocalComponent not provided".toString());
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void Compose17IJSizeBugWorkaround(Function2 content, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 1058777190
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_1
/*     */     //   9: iload_2
/*     */     //   10: istore_3
/*     */     //   11: iload_2
/*     */     //   12: bipush #6
/*     */     //   14: iand
/*     */     //   15: ifne -> 36
/*     */     //   18: iload_3
/*     */     //   19: aload_1
/*     */     //   20: aload_0
/*     */     //   21: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: iconst_4
/*     */     //   30: goto -> 34
/*     */     //   33: iconst_2
/*     */     //   34: ior
/*     */     //   35: istore_3
/*     */     //   36: iload_3
/*     */     //   37: iconst_3
/*     */     //   38: iand
/*     */     //   39: iconst_2
/*     */     //   40: if_icmpne -> 52
/*     */     //   43: aload_1
/*     */     //   44: invokeinterface getSkipping : ()Z
/*     */     //   49: ifne -> 578
/*     */     //   52: invokestatic isTraceInProgress : ()Z
/*     */     //   55: ifeq -> 67
/*     */     //   58: ldc 1058777190
/*     */     //   60: iload_3
/*     */     //   61: iconst_m1
/*     */     //   62: ldc 'org.jetbrains.jewel.bridge.Compose17IJSizeBugWorkaround (JewelComposePanel.kt:109)'
/*     */     //   64: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   67: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   70: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   73: astore #4
/*     */     //   75: iconst_0
/*     */     //   76: istore #5
/*     */     //   78: iconst_0
/*     */     //   79: istore #6
/*     */     //   81: aload_1
/*     */     //   82: ldc 2023513938
/*     */     //   84: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   86: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   89: aload_1
/*     */     //   90: aload #4
/*     */     //   92: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   97: astore #7
/*     */     //   99: aload_1
/*     */     //   100: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   103: aload #7
/*     */     //   105: checkcast androidx/compose/ui/unit/Density
/*     */     //   108: astore #5
/*     */     //   110: iconst_0
/*     */     //   111: istore #6
/*     */     //   113: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   116: checkcast androidx/compose/ui/Modifier
/*     */     //   119: aload #5
/*     */     //   121: invokestatic getLocalWindowInfo : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   124: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   127: astore #7
/*     */     //   129: iconst_0
/*     */     //   130: istore #8
/*     */     //   132: iconst_0
/*     */     //   133: istore #9
/*     */     //   135: aload_1
/*     */     //   136: ldc 2023513938
/*     */     //   138: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   140: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   143: aload_1
/*     */     //   144: aload #7
/*     */     //   146: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   151: astore #10
/*     */     //   153: aload_1
/*     */     //   154: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   157: aload #10
/*     */     //   159: checkcast androidx/compose/ui/platform/WindowInfo
/*     */     //   162: invokeinterface getContainerSize-YbymL2g : ()J
/*     */     //   167: invokestatic toSize-ozmzZPI : (J)J
/*     */     //   170: invokeinterface toDpSize-k-rfVVM : (J)J
/*     */     //   175: invokestatic requiredSize-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   178: astore #7
/*     */     //   180: iconst_0
/*     */     //   181: istore #10
/*     */     //   183: iconst_0
/*     */     //   184: istore #11
/*     */     //   186: aload_1
/*     */     //   187: ldc 733328855
/*     */     //   189: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   191: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   194: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   197: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   200: astore #8
/*     */     //   202: iconst_0
/*     */     //   203: istore #9
/*     */     //   205: aload #8
/*     */     //   207: iload #9
/*     */     //   209: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   212: astore #12
/*     */     //   214: bipush #112
/*     */     //   216: iload #10
/*     */     //   218: iconst_3
/*     */     //   219: ishl
/*     */     //   220: iand
/*     */     //   221: istore #13
/*     */     //   223: nop
/*     */     //   224: iconst_0
/*     */     //   225: istore #14
/*     */     //   227: aload_1
/*     */     //   228: ldc_w -1323940314
/*     */     //   231: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   234: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   237: aload_1
/*     */     //   238: iconst_0
/*     */     //   239: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   242: istore #15
/*     */     //   244: aload_1
/*     */     //   245: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   250: astore #16
/*     */     //   252: aload_1
/*     */     //   253: aload #7
/*     */     //   255: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   258: astore #17
/*     */     //   260: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   263: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   266: astore #18
/*     */     //   268: bipush #6
/*     */     //   270: sipush #896
/*     */     //   273: iload #13
/*     */     //   275: bipush #6
/*     */     //   277: ishl
/*     */     //   278: iand
/*     */     //   279: ior
/*     */     //   280: istore #19
/*     */     //   282: nop
/*     */     //   283: iconst_0
/*     */     //   284: istore #20
/*     */     //   286: aload_1
/*     */     //   287: ldc_w -692256719
/*     */     //   290: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   293: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   296: aload_1
/*     */     //   297: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   302: instanceof androidx/compose/runtime/Applier
/*     */     //   305: ifne -> 311
/*     */     //   308: invokestatic invalidApplier : ()V
/*     */     //   311: aload_1
/*     */     //   312: invokeinterface startReusableNode : ()V
/*     */     //   317: aload_1
/*     */     //   318: invokeinterface getInserting : ()Z
/*     */     //   323: ifeq -> 337
/*     */     //   326: aload_1
/*     */     //   327: aload #18
/*     */     //   329: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   334: goto -> 343
/*     */     //   337: aload_1
/*     */     //   338: invokeinterface useNode : ()V
/*     */     //   343: aload_1
/*     */     //   344: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   347: astore #21
/*     */     //   349: iconst_0
/*     */     //   350: istore #22
/*     */     //   352: aload #21
/*     */     //   354: aload #12
/*     */     //   356: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   359: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   362: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   365: aload #21
/*     */     //   367: aload #16
/*     */     //   369: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   372: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   375: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   378: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   381: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   384: astore #23
/*     */     //   386: iconst_0
/*     */     //   387: istore #24
/*     */     //   389: aload #21
/*     */     //   391: astore #25
/*     */     //   393: iconst_0
/*     */     //   394: istore #26
/*     */     //   396: aload #25
/*     */     //   398: invokeinterface getInserting : ()Z
/*     */     //   403: ifne -> 424
/*     */     //   406: aload #25
/*     */     //   408: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   413: iload #15
/*     */     //   415: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   418: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   421: ifne -> 450
/*     */     //   424: aload #25
/*     */     //   426: iload #15
/*     */     //   428: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   431: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   436: aload #21
/*     */     //   438: iload #15
/*     */     //   440: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   443: aload #23
/*     */     //   445: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   450: nop
/*     */     //   451: nop
/*     */     //   452: nop
/*     */     //   453: aload #21
/*     */     //   455: aload #17
/*     */     //   457: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   460: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   463: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   466: nop
/*     */     //   467: nop
/*     */     //   468: aload_1
/*     */     //   469: bipush #14
/*     */     //   471: iload #19
/*     */     //   473: bipush #6
/*     */     //   475: ishr
/*     */     //   476: iand
/*     */     //   477: istore #27
/*     */     //   479: astore #28
/*     */     //   481: iconst_0
/*     */     //   482: istore #29
/*     */     //   484: aload #28
/*     */     //   486: ldc_w -2146769399
/*     */     //   489: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   492: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   495: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   498: aload #28
/*     */     //   500: bipush #6
/*     */     //   502: bipush #112
/*     */     //   504: iload #10
/*     */     //   506: bipush #6
/*     */     //   508: ishr
/*     */     //   509: iand
/*     */     //   510: ior
/*     */     //   511: istore #30
/*     */     //   513: astore #31
/*     */     //   515: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   518: astore #32
/*     */     //   520: iconst_0
/*     */     //   521: istore #33
/*     */     //   523: aload_0
/*     */     //   524: aload #31
/*     */     //   526: bipush #14
/*     */     //   528: iload_3
/*     */     //   529: iand
/*     */     //   530: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   533: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   538: pop
/*     */     //   539: aload #28
/*     */     //   541: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   544: aload_1
/*     */     //   545: invokeinterface endNode : ()V
/*     */     //   550: aload_1
/*     */     //   551: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   554: nop
/*     */     //   555: aload_1
/*     */     //   556: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   559: nop
/*     */     //   560: aload_1
/*     */     //   561: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   564: nop
/*     */     //   565: nop
/*     */     //   566: invokestatic isTraceInProgress : ()Z
/*     */     //   569: ifeq -> 584
/*     */     //   572: invokestatic traceEventEnd : ()V
/*     */     //   575: goto -> 584
/*     */     //   578: aload_1
/*     */     //   579: invokeinterface skipToGroupEnd : ()V
/*     */     //   584: aload_1
/*     */     //   585: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   590: dup
/*     */     //   591: ifnull -> 609
/*     */     //   594: aload_0
/*     */     //   595: iload_2
/*     */     //   596: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   601: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   606: goto -> 610
/*     */     //   609: pop
/*     */     //   610: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #110	-> 0
/*     */     //   #111	-> 67
/*     */     //   #116	-> 86
/*     */     //   #111	-> 105
/*     */     //   #112	-> 113
/*     */     //   #117	-> 140
/*     */     //   #112	-> 162
/*     */     //   #118	-> 191
/*     */     //   #119	-> 194
/*     */     //   #120	-> 202
/*     */     //   #123	-> 205
/*     */     //   #124	-> 223
/*     */     //   #125	-> 234
/*     */     //   #126	-> 239
/*     */     //   #127	-> 245
/*     */     //   #128	-> 253
/*     */     //   #130	-> 260
/*     */     //   #129	-> 282
/*     */     //   #131	-> 293
/*     */     //   #132	-> 296
/*     */     //   #133	-> 312
/*     */     //   #134	-> 317
/*     */     //   #135	-> 327
/*     */     //   #137	-> 338
/*     */     //   #139	-> 343
/*     */     //   #140	-> 352
/*     */     //   #141	-> 365
/*     */     //   #143	-> 378
/*     */     //   #144	-> 389
/*     */     //   #145	-> 396
/*     */     //   #146	-> 424
/*     */     //   #147	-> 436
/*     */     //   #149	-> 450
/*     */     //   #144	-> 451
/*     */     //   #149	-> 452
/*     */     //   #150	-> 453
/*     */     //   #151	-> 466
/*     */     //   #139	-> 467
/*     */     //   #152	-> 468
/*     */     //   #153	-> 492
/*     */     //   #112	-> 523
/*     */     //   #153	-> 539
/*     */     //   #152	-> 544
/*     */     //   #154	-> 545
/*     */     //   #131	-> 551
/*     */     //   #155	-> 554
/*     */     //   #125	-> 556
/*     */     //   #156	-> 559
/*     */     //   #118	-> 561
/*     */     //   #157	-> 564
/*     */     //   #113	-> 565
/*     */     //   #111	-> 566
/*     */     //   #114	-> 578
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   81	24	6	$i$f$getCurrent	I
/*     */     //   78	27	4	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   78	27	5	$changed$iv	I
/*     */     //   135	24	9	$i$f$getCurrent	I
/*     */     //   132	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   132	27	8	$changed$iv	I
/*     */     //   523	16	33	$i$a$-Box-JewelComposePanelKt$Compose17IJSizeBugWorkaround$1$1	I
/*     */     //   520	19	32	$this$Compose17IJSizeBugWorkaround_u24lambda_u2410_u24lambda_u249	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   520	19	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   520	19	30	$changed	I
/*     */     //   484	60	29	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   481	63	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   481	63	27	$changed$iv	I
/*     */     //   396	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   393	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   389	64	24	$i$f$set-impl	I
/*     */     //   386	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   352	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   349	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   286	269	20	$i$f$ReusableComposeNode	I
/*     */     //   283	272	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   283	272	19	$changed$iv$iv$iv	I
/*     */     //   227	333	14	$i$f$Layout	I
/*     */     //   244	316	15	compositeKeyHash$iv$iv	I
/*     */     //   252	308	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   260	300	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   224	336	13	$changed$iv$iv	I
/*     */     //   186	379	11	$i$f$Box	I
/*     */     //   214	351	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   183	382	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   202	363	8	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   205	360	9	propagateMinConstraints$iv	Z
/*     */     //   183	382	10	$changed$iv	I
/*     */     //   113	453	6	$i$a$-with-JewelComposePanelKt$Compose17IJSizeBugWorkaround$1	I
/*     */     //   110	456	5	$this$Compose17IJSizeBugWorkaround_u24lambda_u2410	Landroidx/compose/ui/unit/Density;
/*     */     //   11	600	3	$dirty	I
/*     */     //   0	611	0	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	611	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	611	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Compose17IJSizeBugWorkaround$lambda$11(Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     Compose17IJSizeBugWorkaround($content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelComposePanelKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */