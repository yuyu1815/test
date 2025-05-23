/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.util;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\002\032*\020\000\032\0020\001*\0020\0022\023\b\004\020\003\032\r\022\t\022\0070\005¢\006\002\b\0060\004H\bø\001\000¢\006\002\020\007\032*\020\b\032\0020\001*\0020\0022\023\b\004\020\003\032\r\022\t\022\0070\005¢\006\002\b\0060\004H\bø\001\000¢\006\002\020\007\032*\020\t\032\0020\001*\0020\0022\023\b\004\020\003\032\r\022\t\022\0070\005¢\006\002\b\0060\004H\bø\001\000¢\006\002\020\007\032$\020\n\032\0020\001*\0020\0022\021\020\003\032\r\022\t\022\0070\005¢\006\002\b\0060\004H\007¢\006\002\020\007\032,\020\017\032\002H\020\"\004\b\000\020\0202\023\b\004\020\021\032\r\022\004\022\002H\0200\004¢\006\002\b\022H\bø\001\000¢\006\002\020\023\"\026\020\013\032\0020\f8\000XT¢\006\b\n\000\022\004\b\r\020\016\002\007\n\005\b20\001¨\006\024"}, d2 = {"Info", "", "Lcom/intellij/openapi/diagnostic/Logger;", "lazyMessage", "Lkotlin/Function0;", "", "Lorg/jetbrains/annotations/NonNls;", "(Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Debug", "Trace", "TraceComposition", "LogEachRecomposition", "", "getLogEachRecomposition$annotations", "()V", "logMaybeOnce", "T", "calculation", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nloggingCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 loggingCompose.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/LoggingComposeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,47:1\n42#1,3:48\n42#1,2:57\n44#1:64\n42#1,2:71\n44#1:77\n1225#2,6:51\n1225#2,6:65\n1225#2,6:78\n1225#2,6:84\n1225#2,6:90\n61#3,5:59\n68#3,4:73\n63#4,5:96\n*S KotlinDebug\n*F\n+ 1 loggingCompose.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/LoggingComposeKt\n*L\n14#1:48,3\n17#1:57,2\n17#1:64\n20#1:71,2\n20#1:77\n14#1:51,6\n17#1:65,6\n20#1:78,6\n26#1:84,6\n44#1:90,6\n17#1:59,5\n20#1:73,4\n28#1:96,5\n*E\n"})
/*    */ public final class LoggingComposeKt {
/*    */   @Composable
/* 14 */   public static final void Info(@NotNull Logger $this$Info, @NotNull Function0 lazyMessage, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$Info, "<this>"); Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage"); int $i$f$Info = 0; $composer.startReplaceGroup(-954919345); int $changed$iv = 0, $i$f$logMaybeOnce = 0; $composer.startReplaceGroup(1070978846);
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
/*    */ 
/*    */ 
/*    */     
/* 50 */     $composer.startReplaceGroup(-673133301); Composer composer = $composer; boolean invalid$iv$iv = false; int $i$f$cache = 0;
/* 51 */     Object it$iv$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/* 52 */     if (it$iv$iv == Composer.Companion.getEmpty()) {
/* 53 */       int $i$a$-cache-LoggingComposeKt$logMaybeOnce$1$iv = 0;
/*    */       int $i$a$-logMaybeOnce-LoggingComposeKt$Info$1 = 0;
/*    */     } 
/* 56 */     Object object1 = it$iv$iv; $composer.endReplaceGroup(); Object object2 = object1;
/*    */     $composer.endReplaceGroup();
/*    */     $composer.endReplaceGroup(); } public static final boolean LogEachRecomposition = false; @Composable public static final void Debug(@NotNull Logger $this$Debug, @NotNull Function0 lazyMessage, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$Debug, "<this>");
/*    */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
/*    */     int $i$f$Debug = 0;
/*    */     $composer.startReplaceGroup(1995314794);
/*    */     int $changed$iv = 0, $i$f$logMaybeOnce = 0;
/*    */     $composer.startReplaceGroup(1070978846);
/* 64 */     $composer.startReplaceGroup(-673133301); Composer composer = $composer; boolean invalid$iv$iv = false; int $i$f$cache = 0;
/* 65 */     Object it$iv$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/* 66 */     if (it$iv$iv == Composer.Companion.getEmpty()) {
/* 67 */       int $i$a$-cache-LoggingComposeKt$logMaybeOnce$1$iv = 0;
/*    */       int $i$a$-logMaybeOnce-LoggingComposeKt$Debug$1 = 0;
/*    */     } 
/* 70 */     Object object1 = it$iv$iv; $composer.endReplaceGroup(); Object object2 = object1; $composer.endReplaceGroup();
/*    */     $composer.endReplaceGroup(); } @Composable public static final void Trace(@NotNull Logger $this$Trace, @NotNull Function0 lazyMessage, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$Trace, "<this>");
/*    */     Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
/*    */     int $i$f$Trace = 0;
/*    */     $composer.startReplaceGroup(71670456);
/*    */     int $changed$iv = 0, $i$f$logMaybeOnce = 0;
/*    */     $composer.startReplaceGroup(1070978846);
/* 77 */     $composer.startReplaceGroup(-673133301); Composer composer = $composer; boolean invalid$iv$iv = false; int $i$f$cache = 0;
/* 78 */     Object it$iv$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/* 79 */     if (it$iv$iv == Composer.Companion.getEmpty()) {
/* 80 */       int $i$a$-cache-LoggingComposeKt$logMaybeOnce$1$iv = 0;
/*    */       int $i$a$-logMaybeOnce-LoggingComposeKt$Trace$1 = 0;
/*    */     } 
/* 83 */     Object object1 = it$iv$iv;
/*    */     $composer.endReplaceGroup();
/*    */     Object object2 = object1;
/*    */     $composer.endReplaceGroup();
/*    */     $composer.endReplaceGroup(); }
/*    */    @Composable
/*    */   public static final void TraceComposition(@NotNull Logger $this$TraceComposition, @NotNull Function0 lazyMessage, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'lazyMessage'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: ldc 591300152
/*    */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   20: astore_2
/*    */     //   21: iload_3
/*    */     //   22: istore #4
/*    */     //   24: iload_3
/*    */     //   25: bipush #6
/*    */     //   27: iand
/*    */     //   28: ifne -> 51
/*    */     //   31: iload #4
/*    */     //   33: aload_2
/*    */     //   34: aload_0
/*    */     //   35: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   40: ifeq -> 47
/*    */     //   43: iconst_4
/*    */     //   44: goto -> 48
/*    */     //   47: iconst_2
/*    */     //   48: ior
/*    */     //   49: istore #4
/*    */     //   51: iload_3
/*    */     //   52: bipush #48
/*    */     //   54: iand
/*    */     //   55: ifne -> 80
/*    */     //   58: iload #4
/*    */     //   60: aload_2
/*    */     //   61: aload_1
/*    */     //   62: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   67: ifeq -> 75
/*    */     //   70: bipush #32
/*    */     //   72: goto -> 77
/*    */     //   75: bipush #16
/*    */     //   77: ior
/*    */     //   78: istore #4
/*    */     //   80: iload #4
/*    */     //   82: bipush #19
/*    */     //   84: iand
/*    */     //   85: bipush #18
/*    */     //   87: if_icmpne -> 99
/*    */     //   90: aload_2
/*    */     //   91: invokeinterface getSkipping : ()Z
/*    */     //   96: ifne -> 262
/*    */     //   99: invokestatic isTraceInProgress : ()Z
/*    */     //   102: ifeq -> 115
/*    */     //   105: ldc 591300152
/*    */     //   107: iload #4
/*    */     //   109: iconst_m1
/*    */     //   110: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.util.TraceComposition (loggingCompose.kt:22)'
/*    */     //   112: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   115: aload_0
/*    */     //   116: invokevirtual isTraceEnabled : ()Z
/*    */     //   119: ifeq -> 250
/*    */     //   122: aload_1
/*    */     //   123: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   128: checkcast java/lang/String
/*    */     //   131: astore #5
/*    */     //   133: aload #5
/*    */     //   135: aload_2
/*    */     //   136: ldc -1296679657
/*    */     //   138: invokeinterface startReplaceGroup : (I)V
/*    */     //   143: aload_2
/*    */     //   144: astore #7
/*    */     //   146: aload_2
/*    */     //   147: aload_0
/*    */     //   148: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   153: aload_2
/*    */     //   154: aload #5
/*    */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   161: ior
/*    */     //   162: istore #8
/*    */     //   164: iconst_0
/*    */     //   165: istore #9
/*    */     //   167: aload #7
/*    */     //   169: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   174: astore #10
/*    */     //   176: iconst_0
/*    */     //   177: istore #11
/*    */     //   179: iload #8
/*    */     //   181: ifne -> 195
/*    */     //   184: aload #10
/*    */     //   186: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   189: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   192: if_acmpne -> 227
/*    */     //   195: astore #14
/*    */     //   197: iconst_0
/*    */     //   198: istore #12
/*    */     //   200: aload_0
/*    */     //   201: aload #5
/*    */     //   203: <illegal opcode> invoke : (Lcom/intellij/openapi/diagnostic/Logger;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*    */     //   208: aload #14
/*    */     //   210: swap
/*    */     //   211: astore #13
/*    */     //   213: aload #7
/*    */     //   215: aload #13
/*    */     //   217: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   222: aload #13
/*    */     //   224: goto -> 229
/*    */     //   227: aload #10
/*    */     //   229: nop
/*    */     //   230: nop
/*    */     //   231: nop
/*    */     //   232: checkcast kotlin/jvm/functions/Function1
/*    */     //   235: astore #6
/*    */     //   237: aload_2
/*    */     //   238: invokeinterface endReplaceGroup : ()V
/*    */     //   243: aload #6
/*    */     //   245: aload_2
/*    */     //   246: iconst_0
/*    */     //   247: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*    */     //   250: invokestatic isTraceInProgress : ()Z
/*    */     //   253: ifeq -> 268
/*    */     //   256: invokestatic traceEventEnd : ()V
/*    */     //   259: goto -> 268
/*    */     //   262: aload_2
/*    */     //   263: invokeinterface skipToGroupEnd : ()V
/*    */     //   268: aload_2
/*    */     //   269: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   274: dup
/*    */     //   275: ifnull -> 294
/*    */     //   278: aload_0
/*    */     //   279: aload_1
/*    */     //   280: iload_3
/*    */     //   281: <illegal opcode> invoke : (Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*    */     //   286: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   291: goto -> 295
/*    */     //   294: pop
/*    */     //   295: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 12
/*    */     //   #24	-> 115
/*    */     //   #25	-> 122
/*    */     //   #26	-> 133
/*    */     //   #84	-> 167
/*    */     //   #85	-> 179
/*    */     //   #86	-> 195
/*    */     //   #26	-> 200
/*    */     //   #86	-> 211
/*    */     //   #87	-> 213
/*    */     //   #88	-> 222
/*    */     //   #89	-> 227
/*    */     //   #85	-> 229
/*    */     //   #84	-> 230
/*    */     //   #84	-> 231
/*    */     //   #26	-> 232
/*    */     //   #33	-> 262
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   200	8	12	$i$a$-cache-LoggingComposeKt$TraceComposition$1	I
/*    */     //   213	11	13	value$iv	Ljava/lang/Object;
/*    */     //   179	51	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   176	54	10	it$iv	Ljava/lang/Object;
/*    */     //   167	65	9	$i$f$cache	I
/*    */     //   164	68	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   164	68	8	invalid$iv	Z
/*    */     //   133	117	5	message	Ljava/lang/String;
/*    */     //   24	272	4	$dirty	I
/*    */     //   0	296	0	$this$TraceComposition	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   0	296	1	lazyMessage	Lkotlin/jvm/functions/Function0;
/*    */     //   0	296	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	296	3	$changed	I
/*    */   } private static final DisposableEffectResult TraceComposition$lambda$5$lambda$4(Logger $this_TraceComposition, String $message, DisposableEffectScope $this$DisposableEffect) {
/*    */     Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
/*    */     $this_TraceComposition.trace($message);
/*    */     DisposableEffectScope this_$iv = $this$DisposableEffect;
/*    */     int $i$f$onDispose = 0;
/* 96 */     return new LoggingComposeKt$TraceComposition$lambda$5$lambda$4$$inlined$onDispose$1($this_TraceComposition, $message);
/*    */   }
/*    */   
/*    */   @PublishedApi
/*    */   @Composable
/*    */   public static final <T> T logMaybeOnce(@NotNull Function0 calculation, @Nullable Composer $composer, int $changed) {
/*    */     Intrinsics.checkNotNullParameter(calculation, "calculation");
/*    */     int $i$f$logMaybeOnce = 0;
/*    */     $composer.startReplaceGroup(1070978846);
/*    */     $composer.startReplaceGroup(-673133301);
/*    */     Composer composer = $composer;
/*    */     boolean invalid$iv = false;
/*    */     int $i$f$cache = 0;
/*    */     Object it$iv = composer.rememberedValue();
/*    */     int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */     if (it$iv == Composer.Companion.getEmpty()) {
/*    */       int $i$a$-cache-LoggingComposeKt$logMaybeOnce$1 = 0;
/*    */       Object value$iv = calculation.invoke();
/*    */       composer.updateRememberedValue(value$iv);
/*    */     } 
/*    */     Object object2 = it$iv;
/*    */     $composer.endReplaceGroup();
/*    */     Object object1 = object2;
/*    */     $composer.endReplaceGroup();
/*    */     return (T)object1;
/*    */   }
/*    */   
/*    */   private static final Unit TraceComposition$lambda$6(Logger $this_TraceComposition, Function0<String> $lazyMessage, int $$changed, Composer $composer, int $force) {
/*    */     TraceComposition($this_TraceComposition, $lazyMessage, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\juni\\util\LoggingComposeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */