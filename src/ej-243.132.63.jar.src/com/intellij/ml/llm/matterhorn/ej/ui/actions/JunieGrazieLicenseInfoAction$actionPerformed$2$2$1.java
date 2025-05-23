/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.ComposeDialogScope;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieThemeKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseData;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class null
/*     */   implements Function3<ComposeDialogScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(ComposeDialogScope $this$ComposeModalDialog, Composer $composer, int $changed) {
/* 153 */     Intrinsics.checkNotNullParameter($this$ComposeModalDialog, "$this$ComposeModalDialog"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= ((($changed & 0x8) == 0) ? $composer.changed($this$ComposeModalDialog) : $composer.changedInstance($this$ComposeModalDialog)) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-301668586, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction.actionPerformed.<anonymous>.<anonymous>.<anonymous> (JunieGrazieLicenseInfoAction.kt:152)");  JunieThemeKt.JunieTheme((Function2)ComposableLambdaKt.rememberComposableLambda(464813951, true, new Function2<Composer, Integer, Unit>($this$ComposeModalDialog, this.$licenseInfo, this.$onUpgradeClicked) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { // Byte code:
/*     */                 //   0: iload_2
/*     */                 //   1: iconst_3
/*     */                 //   2: iand
/*     */                 //   3: iconst_2
/*     */                 //   4: if_icmpne -> 16
/*     */                 //   7: aload_1
/*     */                 //   8: invokeinterface getSkipping : ()Z
/*     */                 //   13: ifne -> 201
/*     */                 //   16: invokestatic isTraceInProgress : ()Z
/*     */                 //   19: ifeq -> 31
/*     */                 //   22: ldc 464813951
/*     */                 //   24: iload_2
/*     */                 //   25: iconst_m1
/*     */                 //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction.actionPerformed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JunieGrazieLicenseInfoAction.kt:153)'
/*     */                 //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */                 //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */                 //   34: checkcast androidx/compose/ui/Modifier
/*     */                 //   37: sipush #420
/*     */                 //   40: istore #4
/*     */                 //   42: iconst_0
/*     */                 //   43: istore #5
/*     */                 //   45: iload #4
/*     */                 //   47: i2f
/*     */                 //   48: invokestatic constructor-impl : (F)F
/*     */                 //   51: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */                 //   54: astore_3
/*     */                 //   55: aload_0
/*     */                 //   56: getfield $this_ComposeModalDialog : Lcom/intellij/ml/llm/matterhorn/ej/ui/ComposeDialogScope;
/*     */                 //   59: astore #5
/*     */                 //   61: aload_1
/*     */                 //   62: ldc 187894161
/*     */                 //   64: invokeinterface startReplaceGroup : (I)V
/*     */                 //   69: aload_1
/*     */                 //   70: astore #7
/*     */                 //   72: aload_1
/*     */                 //   73: aload #5
/*     */                 //   75: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */                 //   80: istore #8
/*     */                 //   82: iconst_0
/*     */                 //   83: istore #9
/*     */                 //   85: aload #7
/*     */                 //   87: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */                 //   92: astore #10
/*     */                 //   94: iconst_0
/*     */                 //   95: istore #11
/*     */                 //   97: iload #8
/*     */                 //   99: ifne -> 113
/*     */                 //   102: aload #10
/*     */                 //   104: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */                 //   107: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */                 //   110: if_acmpne -> 144
/*     */                 //   113: iconst_0
/*     */                 //   114: istore #12
/*     */                 //   116: new com/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2$2$1$1$1$1
/*     */                 //   119: dup
/*     */                 //   120: aload #5
/*     */                 //   122: invokespecial <init> : (Ljava/lang/Object;)V
/*     */                 //   125: checkcast kotlin/reflect/KFunction
/*     */                 //   128: astore #13
/*     */                 //   130: aload #7
/*     */                 //   132: aload #13
/*     */                 //   134: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */                 //   139: aload #13
/*     */                 //   141: goto -> 146
/*     */                 //   144: aload #10
/*     */                 //   146: nop
/*     */                 //   147: nop
/*     */                 //   148: nop
/*     */                 //   149: checkcast kotlin/reflect/KFunction
/*     */                 //   152: astore #6
/*     */                 //   154: aload_1
/*     */                 //   155: invokeinterface endReplaceGroup : ()V
/*     */                 //   160: aload #6
/*     */                 //   162: astore #4
/*     */                 //   164: aload_0
/*     */                 //   165: getfield $licenseInfo : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;
/*     */                 //   168: aload_3
/*     */                 //   169: aload #4
/*     */                 //   171: checkcast kotlin/jvm/functions/Function0
/*     */                 //   174: aload_0
/*     */                 //   175: getfield $onUpgradeClicked : Lkotlin/jvm/functions/Function0;
/*     */                 //   178: aload_1
/*     */                 //   179: bipush #48
/*     */                 //   181: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData.$stable : I
/*     */                 //   184: ior
/*     */                 //   185: iconst_0
/*     */                 //   186: invokestatic LicenseDialog : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */                 //   189: invokestatic isTraceInProgress : ()Z
/*     */                 //   192: ifeq -> 207
/*     */                 //   195: invokestatic traceEventEnd : ()V
/*     */                 //   198: goto -> 207
/*     */                 //   201: aload_1
/*     */                 //   202: invokeinterface skipToGroupEnd : ()V
/*     */                 //   207: return
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #154	-> 0
/*     */                 //   #155	-> 31
/*     */                 //   #179	-> 45
/*     */                 //   #155	-> 51
/*     */                 //   #157	-> 55
/*     */                 //   #180	-> 85
/*     */                 //   #181	-> 97
/*     */                 //   #182	-> 113
/*     */                 //   #157	-> 116
/*     */                 //   #182	-> 128
/*     */                 //   #183	-> 130
/*     */                 //   #184	-> 139
/*     */                 //   #185	-> 144
/*     */                 //   #181	-> 146
/*     */                 //   #180	-> 147
/*     */                 //   #180	-> 148
/*     */                 //   #157	-> 149
/*     */                 //   #156	-> 164
/*     */                 //   #155	-> 168
/*     */                 //   #157	-> 169
/*     */                 //   #158	-> 174
/*     */                 //   #154	-> 186
/*     */                 //   #159	-> 201
/*     */                 //   #160	-> 207
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   45	6	5	$i$f$getDp	I
/*     */                 //   42	9	4	$this$dp$iv	I
/*     */                 //   116	12	12	$i$a$-cache-JunieGrazieLicenseInfoAction$actionPerformed$2$2$1$1$1	I
/*     */                 //   130	11	13	value$iv	Ljava/lang/Object;
/*     */                 //   97	50	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */                 //   94	53	10	it$iv	Ljava/lang/Object;
/*     */                 //   85	64	9	$i$f$cache	I
/*     */                 //   82	67	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */                 //   82	67	8	invalid$iv	Z
/*     */                 //   0	208	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2$2$1$1;
/*     */                 //   0	208	1	$composer	Landroidx/compose/runtime/Composer;
/* 153 */                 //   0	208	2	$changed	I } }$composer, 54), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();
/*     */       
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/* 160 */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   null(LicenseData $licenseInfo, Function0<Unit> $onUpgradeClicked) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\JunieGrazieLicenseInfoAction$actionPerformed$2$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */