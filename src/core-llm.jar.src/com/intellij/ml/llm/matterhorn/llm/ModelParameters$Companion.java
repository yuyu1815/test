/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\005\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\n\020\004\032\0020\005*\0020\006J\n\020\007\032\0020\005*\0020\006J\n\020\b\032\0020\005*\0020\006J\n\020\t\032\0020\005*\0020\006J\036\020\n\032\0020\0062\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\f\020\020\032\b\022\004\022\0020\0060\021¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;", "", "<init>", "()V", "isAnthropic", "", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "isGoogle", "isServerMode", "isO", "getDefaultModel", "user", "", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nModelParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelParameters.kt\ncom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<ModelParameters> serializer() {
/* 215 */     return (KSerializer<ModelParameters>)ModelParameters.$serializer.INSTANCE;
/*     */   }
/*     */   public final boolean isAnthropic(@NotNull ModelParameters $this$isAnthropic) {
/* 218 */     Intrinsics.checkNotNullParameter($this$isAnthropic, "<this>"); return StringsKt.startsWith$default($this$isAnthropic.getModel().getName(), "claude-", false, 2, null);
/*     */   }
/*     */   
/*     */   public final boolean isGoogle(@NotNull ModelParameters $this$isGoogle) {
/* 222 */     Intrinsics.checkNotNullParameter($this$isGoogle, "<this>"); return ($this$isGoogle.getModel().getProvider() == LlmProvider.Google);
/*     */   }
/*     */   
/*     */   public final boolean isServerMode(@NotNull ModelParameters $this$isServerMode) {
/* 226 */     Intrinsics.checkNotNullParameter($this$isServerMode, "<this>"); return Intrinsics.areEqual($this$isServerMode.getModel().getProvider().name(), "ServerMode");
/*     */   }
/*     */   
/*     */   public final boolean isO(@NotNull ModelParameters $this$isO) {
/* 230 */     Intrinsics.checkNotNullParameter($this$isO, "<this>"); return ($this$isO.getModel().getProvider() == LlmProvider.OpenAI && StringsKt.startsWith$default($this$isO.getModel().getName(), "o", false, 2, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final CharSequence getDefaultModel$lambda$1(LLM it) {
/* 237 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getName();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getDefaultModel(@NotNull String user, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion$getDefaultModel$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion$getDefaultModel$1
/*     */     //   11: astore #13
/*     */     //   13: aload #13
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #13
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion$getDefaultModel$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #13
/*     */     //   50: aload #13
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #12
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #13
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 754, 0 -> 100, 1 -> 146, 2 -> 376, 3 -> 483, 4 -> 601
/*     */     //   100: aload #12
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_2
/*     */     //   106: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   109: invokevirtual getMATTERHORN_DEFAULT_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   112: aload #13
/*     */     //   114: aload #13
/*     */     //   116: aload_1
/*     */     //   117: putfield L$0 : Ljava/lang/Object;
/*     */     //   120: aload #13
/*     */     //   122: aload_2
/*     */     //   123: putfield L$1 : Ljava/lang/Object;
/*     */     //   126: aload #13
/*     */     //   128: iconst_1
/*     */     //   129: putfield label : I
/*     */     //   132: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: aload #14
/*     */     //   140: if_acmpne -> 171
/*     */     //   143: aload #14
/*     */     //   145: areturn
/*     */     //   146: aload #13
/*     */     //   148: getfield L$1 : Ljava/lang/Object;
/*     */     //   151: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   154: astore_2
/*     */     //   155: aload #13
/*     */     //   157: getfield L$0 : Ljava/lang/Object;
/*     */     //   160: checkcast java/lang/String
/*     */     //   163: astore_1
/*     */     //   164: aload #12
/*     */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   169: aload #12
/*     */     //   171: checkcast java/lang/String
/*     */     //   174: dup
/*     */     //   175: ifnonnull -> 192
/*     */     //   178: pop
/*     */     //   179: new java/lang/IllegalStateException
/*     */     //   182: dup
/*     */     //   183: ldc 'No default model set in settings'
/*     */     //   185: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   191: athrow
/*     */     //   192: astore #4
/*     */     //   194: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*     */     //   197: invokevirtual getKnownModels : ()Ljava/util/List;
/*     */     //   200: checkcast java/lang/Iterable
/*     */     //   203: astore #7
/*     */     //   205: aload #7
/*     */     //   207: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   212: astore #8
/*     */     //   214: aload #8
/*     */     //   216: invokeinterface hasNext : ()Z
/*     */     //   221: ifeq -> 270
/*     */     //   224: aload #8
/*     */     //   226: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   231: astore #9
/*     */     //   233: aload #9
/*     */     //   235: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   238: astore #10
/*     */     //   240: iconst_0
/*     */     //   241: istore #11
/*     */     //   243: aload #10
/*     */     //   245: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   248: aload #4
/*     */     //   250: checkcast java/lang/CharSequence
/*     */     //   253: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   256: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   259: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   262: ifeq -> 214
/*     */     //   265: aload #9
/*     */     //   267: goto -> 271
/*     */     //   270: aconst_null
/*     */     //   271: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   274: astore #5
/*     */     //   276: aload #5
/*     */     //   278: dup
/*     */     //   279: ifnonnull -> 326
/*     */     //   282: pop
/*     */     //   283: new java/lang/IllegalStateException
/*     */     //   286: dup
/*     */     //   287: aload #4
/*     */     //   289: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*     */     //   292: invokevirtual getKnownModels : ()Ljava/util/List;
/*     */     //   295: checkcast java/lang/Iterable
/*     */     //   298: aconst_null
/*     */     //   299: aconst_null
/*     */     //   300: aconst_null
/*     */     //   301: iconst_0
/*     */     //   302: aconst_null
/*     */     //   303: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   308: bipush #31
/*     */     //   310: aconst_null
/*     */     //   311: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   314: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   319: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   322: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   325: athrow
/*     */     //   326: astore #6
/*     */     //   328: aload_2
/*     */     //   329: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   332: invokevirtual getMATTERHORN_DEFAULT_MODEL_TEMPERATURE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   335: aload #13
/*     */     //   337: aload #13
/*     */     //   339: aload_1
/*     */     //   340: putfield L$0 : Ljava/lang/Object;
/*     */     //   343: aload #13
/*     */     //   345: aload_2
/*     */     //   346: putfield L$1 : Ljava/lang/Object;
/*     */     //   349: aload #13
/*     */     //   351: aload #6
/*     */     //   353: putfield L$2 : Ljava/lang/Object;
/*     */     //   356: aload #13
/*     */     //   358: iconst_2
/*     */     //   359: putfield label : I
/*     */     //   362: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   367: dup
/*     */     //   368: aload #14
/*     */     //   370: if_acmpne -> 411
/*     */     //   373: aload #14
/*     */     //   375: areturn
/*     */     //   376: aload #13
/*     */     //   378: getfield L$2 : Ljava/lang/Object;
/*     */     //   381: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   384: astore #6
/*     */     //   386: aload #13
/*     */     //   388: getfield L$1 : Ljava/lang/Object;
/*     */     //   391: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   394: astore_2
/*     */     //   395: aload #13
/*     */     //   397: getfield L$0 : Ljava/lang/Object;
/*     */     //   400: checkcast java/lang/String
/*     */     //   403: astore_1
/*     */     //   404: aload #12
/*     */     //   406: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   409: aload #12
/*     */     //   411: checkcast java/lang/String
/*     */     //   414: dup
/*     */     //   415: ifnull -> 424
/*     */     //   418: invokestatic toDoubleOrNull : (Ljava/lang/String;)Ljava/lang/Double;
/*     */     //   421: goto -> 426
/*     */     //   424: pop
/*     */     //   425: aconst_null
/*     */     //   426: astore #7
/*     */     //   428: aload_2
/*     */     //   429: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   432: invokevirtual getMATTERHORN_DEFAULT_MODEL_TOP_P : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   435: aload #13
/*     */     //   437: aload #13
/*     */     //   439: aload_1
/*     */     //   440: putfield L$0 : Ljava/lang/Object;
/*     */     //   443: aload #13
/*     */     //   445: aload_2
/*     */     //   446: putfield L$1 : Ljava/lang/Object;
/*     */     //   449: aload #13
/*     */     //   451: aload #6
/*     */     //   453: putfield L$2 : Ljava/lang/Object;
/*     */     //   456: aload #13
/*     */     //   458: aload #7
/*     */     //   460: putfield L$3 : Ljava/lang/Object;
/*     */     //   463: aload #13
/*     */     //   465: iconst_3
/*     */     //   466: putfield label : I
/*     */     //   469: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   474: dup
/*     */     //   475: aload #14
/*     */     //   477: if_acmpne -> 528
/*     */     //   480: aload #14
/*     */     //   482: areturn
/*     */     //   483: aload #13
/*     */     //   485: getfield L$3 : Ljava/lang/Object;
/*     */     //   488: checkcast java/lang/Double
/*     */     //   491: astore #7
/*     */     //   493: aload #13
/*     */     //   495: getfield L$2 : Ljava/lang/Object;
/*     */     //   498: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   501: astore #6
/*     */     //   503: aload #13
/*     */     //   505: getfield L$1 : Ljava/lang/Object;
/*     */     //   508: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   511: astore_2
/*     */     //   512: aload #13
/*     */     //   514: getfield L$0 : Ljava/lang/Object;
/*     */     //   517: checkcast java/lang/String
/*     */     //   520: astore_1
/*     */     //   521: aload #12
/*     */     //   523: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   526: aload #12
/*     */     //   528: checkcast java/lang/String
/*     */     //   531: dup
/*     */     //   532: ifnull -> 541
/*     */     //   535: invokestatic toDoubleOrNull : (Ljava/lang/String;)Ljava/lang/Double;
/*     */     //   538: goto -> 543
/*     */     //   541: pop
/*     */     //   542: aconst_null
/*     */     //   543: astore #8
/*     */     //   545: aload_2
/*     */     //   546: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   549: invokevirtual getMATTERHORN_LLM_RANDOM_SEED : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   552: aload #13
/*     */     //   554: aload #13
/*     */     //   556: aload_1
/*     */     //   557: putfield L$0 : Ljava/lang/Object;
/*     */     //   560: aload #13
/*     */     //   562: aload #6
/*     */     //   564: putfield L$1 : Ljava/lang/Object;
/*     */     //   567: aload #13
/*     */     //   569: aload #7
/*     */     //   571: putfield L$2 : Ljava/lang/Object;
/*     */     //   574: aload #13
/*     */     //   576: aload #8
/*     */     //   578: putfield L$3 : Ljava/lang/Object;
/*     */     //   581: aload #13
/*     */     //   583: iconst_4
/*     */     //   584: putfield label : I
/*     */     //   587: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   592: dup
/*     */     //   593: aload #14
/*     */     //   595: if_acmpne -> 647
/*     */     //   598: aload #14
/*     */     //   600: areturn
/*     */     //   601: aload #13
/*     */     //   603: getfield L$3 : Ljava/lang/Object;
/*     */     //   606: checkcast java/lang/Double
/*     */     //   609: astore #8
/*     */     //   611: aload #13
/*     */     //   613: getfield L$2 : Ljava/lang/Object;
/*     */     //   616: checkcast java/lang/Double
/*     */     //   619: astore #7
/*     */     //   621: aload #13
/*     */     //   623: getfield L$1 : Ljava/lang/Object;
/*     */     //   626: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   629: astore #6
/*     */     //   631: aload #13
/*     */     //   633: getfield L$0 : Ljava/lang/Object;
/*     */     //   636: checkcast java/lang/String
/*     */     //   639: astore_1
/*     */     //   640: aload #12
/*     */     //   642: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   645: aload #12
/*     */     //   647: checkcast java/lang/String
/*     */     //   650: dup
/*     */     //   651: ifnull -> 667
/*     */     //   654: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
/*     */     //   657: dup
/*     */     //   658: ifnull -> 667
/*     */     //   661: invokevirtual intValue : ()I
/*     */     //   664: goto -> 669
/*     */     //   667: pop
/*     */     //   668: iconst_0
/*     */     //   669: istore #9
/*     */     //   671: iload #9
/*     */     //   673: bipush #100
/*     */     //   675: imul
/*     */     //   676: ldc 100000
/*     */     //   678: if_icmpge -> 685
/*     */     //   681: iconst_1
/*     */     //   682: goto -> 686
/*     */     //   685: iconst_0
/*     */     //   686: istore #10
/*     */     //   688: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   691: ifeq -> 713
/*     */     //   694: iload #10
/*     */     //   696: ifne -> 713
/*     */     //   699: ldc 'Assertion failed'
/*     */     //   701: astore #11
/*     */     //   703: new java/lang/AssertionError
/*     */     //   706: dup
/*     */     //   707: aload #11
/*     */     //   709: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   712: athrow
/*     */     //   713: ldc 100000
/*     */     //   715: bipush #100
/*     */     //   717: iload #9
/*     */     //   719: imul
/*     */     //   720: iadd
/*     */     //   721: istore #10
/*     */     //   723: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   726: dup
/*     */     //   727: aload #6
/*     */     //   729: iconst_0
/*     */     //   730: aload #7
/*     */     //   732: aload #8
/*     */     //   734: aconst_null
/*     */     //   735: aconst_null
/*     */     //   736: aconst_null
/*     */     //   737: aconst_null
/*     */     //   738: aconst_null
/*     */     //   739: aconst_null
/*     */     //   740: aconst_null
/*     */     //   741: aload_1
/*     */     //   742: aconst_null
/*     */     //   743: iload #10
/*     */     //   745: aconst_null
/*     */     //   746: sipush #22514
/*     */     //   749: aconst_null
/*     */     //   750: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   753: areturn
/*     */     //   754: new java/lang/IllegalStateException
/*     */     //   757: dup
/*     */     //   758: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   760: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   763: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #233	-> 60
/*     */     //   #234	-> 105
/*     */     //   #233	-> 143
/*     */     //   #234	-> 171
/*     */     //   #236	-> 194
/*     */     //   #255	-> 240
/*     */     //   #236	-> 243
/*     */     //   #236	-> 259
/*     */     //   #236	-> 262
/*     */     //   #236	-> 271
/*     */     //   #237	-> 276
/*     */     //   #239	-> 328
/*     */     //   #233	-> 373
/*     */     //   #239	-> 411
/*     */     //   #240	-> 428
/*     */     //   #233	-> 480
/*     */     //   #240	-> 528
/*     */     //   #241	-> 545
/*     */     //   #233	-> 598
/*     */     //   #241	-> 647
/*     */     //   #242	-> 671
/*     */     //   #243	-> 713
/*     */     //   #245	-> 723
/*     */     //   #246	-> 727
/*     */     //   #245	-> 729
/*     */     //   #248	-> 730
/*     */     //   #249	-> 732
/*     */     //   #245	-> 734
/*     */     //   #247	-> 741
/*     */     //   #245	-> 742
/*     */     //   #250	-> 743
/*     */     //   #245	-> 745
/*     */     //   #233	-> 754
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	41	1	user	Ljava/lang/String;
/*     */     //   164	14	1	user	Ljava/lang/String;
/*     */     //   192	70	1	user	Ljava/lang/String;
/*     */     //   262	114	1	user	Ljava/lang/String;
/*     */     //   404	79	1	user	Ljava/lang/String;
/*     */     //   521	80	1	user	Ljava/lang/String;
/*     */     //   640	73	1	user	Ljava/lang/String;
/*     */     //   713	41	1	user	Ljava/lang/String;
/*     */     //   105	41	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   155	23	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   192	70	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   262	114	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   395	88	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   512	80	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   194	68	4	name	Ljava/lang/String;
/*     */     //   262	9	4	name	Ljava/lang/String;
/*     */     //   271	11	4	name	Ljava/lang/String;
/*     */     //   282	44	4	name	Ljava/lang/String;
/*     */     //   276	6	5	knownModel	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   328	48	6	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   386	97	6	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   503	98	6	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   631	82	6	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   713	41	6	model	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   428	55	7	temperature	Ljava/lang/Double;
/*     */     //   493	108	7	temperature	Ljava/lang/Double;
/*     */     //   621	92	7	temperature	Ljava/lang/Double;
/*     */     //   713	41	7	temperature	Ljava/lang/Double;
/*     */     //   545	56	8	topP	Ljava/lang/Double;
/*     */     //   611	102	8	topP	Ljava/lang/Double;
/*     */     //   713	41	8	topP	Ljava/lang/Double;
/*     */     //   671	42	9	seedFromEnv	I
/*     */     //   713	41	9	seedFromEnv	I
/*     */     //   240	22	10	it	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   723	31	10	seed	I
/*     */     //   243	19	11	$i$a$-find-ModelParameters$Companion$getDefaultModel$knownModel$1	I
/*     */     //   0	764	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	704	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	697	12	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ModelParameters.kt", l = {234, 239, 240, 241}, i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"user", "propertyProvider", "user", "propertyProvider", "model", "user", "propertyProvider", "model", "temperature", "user", "model", "temperature", "topP"}, m = "getDefaultModel", c = "com.intellij.ml.llm.matterhorn.llm.ModelParameters$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ModelParameters$Companion$getDefaultModel$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     ModelParameters$Companion$getDefaultModel$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ModelParameters.Companion.this.getDefaultModel(null, null, (Continuation<? super ModelParameters>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\ModelParameters$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */