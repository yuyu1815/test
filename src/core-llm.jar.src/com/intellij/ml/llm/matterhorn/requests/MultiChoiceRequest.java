/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\0020\001Bu\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\016\b\002\020\013\032\b\022\004\022\0020\f0\005\0224\020\r\0320\b\001\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0060\005\022\020\022\016\022\n\022\b\022\004\022\0020\0060\0050\020\022\006\022\004\030\0010\0210\016¢\006\004\b\022\020\023J\026\020\025\032\0020\0262\006\020\027\032\0020\017H@¢\006\002\020\030R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\t\032\0020\nX\004¢\006\002\n\000R\024\020\013\032\b\022\004\022\0020\f0\005X\004¢\006\002\n\000R>\020\r\0320\b\001\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0060\005\022\020\022\016\022\n\022\b\022\004\022\0020\0060\0050\020\022\006\022\004\030\0010\0210\016X\004¢\006\004\n\002\020\024¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "systemMessage", "", "messages", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "numberOfSuggestions", "", "tools", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "critic", "Lkotlin/Function3;", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nMultiChoiceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiChoiceRequest.kt\ncom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n24#2:68\n24#2:69\n1557#3:70\n1628#3,3:71\n*S KotlinDebug\n*F\n+ 1 MultiChoiceRequest.kt\ncom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest\n*L\n42#1:68\n45#1:69\n58#1:70\n58#1:71,3\n*E\n"})
/*    */ public final class MultiChoiceRequest implements GrazieRequest {
/*    */   public MultiChoiceRequest(@NotNull String systemMessage, @NotNull List<MatterhornChatElement> messages, @NotNull ModelParameters modelParameters, int numberOfSuggestions, @NotNull List<MatterhornTool> tools, @NotNull Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> critic) {
/* 10 */     this.systemMessage = systemMessage;
/* 11 */     this.messages = messages;
/* 12 */     this.modelParameters = modelParameters;
/* 13 */     this.numberOfSuggestions = numberOfSuggestions;
/* 14 */     this.tools = tools;
/* 15 */     this.critic = critic;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final String systemMessage;
/*    */   @NotNull
/*    */   private final List<MatterhornChatElement> messages;
/*    */   @NotNull
/*    */   private final ModelParameters modelParameters;
/*    */   private final int numberOfSuggestions;
/*    */   @NotNull
/*    */   private final List<MatterhornTool> tools;
/*    */   @NotNull
/*    */   private final Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object> critic;
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest$execute$1
/*    */     //   11: astore #20
/*    */     //   13: aload #20
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #20
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #20
/*    */     //   50: aload #20
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #19
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #21
/*    */     //   62: aload #20
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 1460, 0 -> 116, 1 -> 186, 2 -> 283, 3 -> 361, 4 -> 686, 5 -> 860, 6 -> 1099, 7 -> 1322, 8 -> 1406
/*    */     //   116: aload #19
/*    */     //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   121: aload_1
/*    */     //   122: aload_0
/*    */     //   123: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   126: aconst_null
/*    */     //   127: iconst_0
/*    */     //   128: aconst_null
/*    */     //   129: aconst_null
/*    */     //   130: aload_0
/*    */     //   131: getfield numberOfSuggestions : I
/*    */     //   134: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   137: aconst_null
/*    */     //   138: aconst_null
/*    */     //   139: aconst_null
/*    */     //   140: aconst_null
/*    */     //   141: aconst_null
/*    */     //   142: aconst_null
/*    */     //   143: aconst_null
/*    */     //   144: aconst_null
/*    */     //   145: iconst_0
/*    */     //   146: aconst_null
/*    */     //   147: sipush #32751
/*    */     //   150: aconst_null
/*    */     //   151: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   154: aload #20
/*    */     //   156: aload #20
/*    */     //   158: aload_0
/*    */     //   159: putfield L$0 : Ljava/lang/Object;
/*    */     //   162: aload #20
/*    */     //   164: aload_1
/*    */     //   165: putfield L$1 : Ljava/lang/Object;
/*    */     //   168: aload #20
/*    */     //   170: iconst_1
/*    */     //   171: putfield label : I
/*    */     //   174: invokevirtual logModelParameters : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   177: dup
/*    */     //   178: aload #21
/*    */     //   180: if_acmpne -> 211
/*    */     //   183: aload #21
/*    */     //   185: areturn
/*    */     //   186: aload #20
/*    */     //   188: getfield L$1 : Ljava/lang/Object;
/*    */     //   191: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   194: astore_1
/*    */     //   195: aload #20
/*    */     //   197: getfield L$0 : Ljava/lang/Object;
/*    */     //   200: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   203: astore_0
/*    */     //   204: aload #19
/*    */     //   206: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   209: aload #19
/*    */     //   211: pop
/*    */     //   212: aload_0
/*    */     //   213: getfield systemMessage : Ljava/lang/String;
/*    */     //   216: iconst_2
/*    */     //   217: newarray char
/*    */     //   219: astore #4
/*    */     //   221: aload #4
/*    */     //   223: iconst_0
/*    */     //   224: bipush #10
/*    */     //   226: castore
/*    */     //   227: aload #4
/*    */     //   229: iconst_1
/*    */     //   230: bipush #32
/*    */     //   232: castore
/*    */     //   233: aload #4
/*    */     //   235: invokestatic trimEnd : (Ljava/lang/String;[C)Ljava/lang/String;
/*    */     //   238: astore_3
/*    */     //   239: aload_1
/*    */     //   240: aload_3
/*    */     //   241: aload_0
/*    */     //   242: getfield tools : Ljava/util/List;
/*    */     //   245: aload #20
/*    */     //   247: aload #20
/*    */     //   249: aload_0
/*    */     //   250: putfield L$0 : Ljava/lang/Object;
/*    */     //   253: aload #20
/*    */     //   255: aload_1
/*    */     //   256: putfield L$1 : Ljava/lang/Object;
/*    */     //   259: aload #20
/*    */     //   261: aload_3
/*    */     //   262: putfield L$2 : Ljava/lang/Object;
/*    */     //   265: aload #20
/*    */     //   267: iconst_2
/*    */     //   268: putfield label : I
/*    */     //   271: invokevirtual logHeadMessage : (Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   274: dup
/*    */     //   275: aload #21
/*    */     //   277: if_acmpne -> 317
/*    */     //   280: aload #21
/*    */     //   282: areturn
/*    */     //   283: aload #20
/*    */     //   285: getfield L$2 : Ljava/lang/Object;
/*    */     //   288: checkcast java/lang/String
/*    */     //   291: astore_3
/*    */     //   292: aload #20
/*    */     //   294: getfield L$1 : Ljava/lang/Object;
/*    */     //   297: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   300: astore_1
/*    */     //   301: aload #20
/*    */     //   303: getfield L$0 : Ljava/lang/Object;
/*    */     //   306: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   309: astore_0
/*    */     //   310: aload #19
/*    */     //   312: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   315: aload #19
/*    */     //   317: pop
/*    */     //   318: aload_1
/*    */     //   319: aload_0
/*    */     //   320: getfield messages : Ljava/util/List;
/*    */     //   323: aload #20
/*    */     //   325: aload #20
/*    */     //   327: aload_0
/*    */     //   328: putfield L$0 : Ljava/lang/Object;
/*    */     //   331: aload #20
/*    */     //   333: aload_1
/*    */     //   334: putfield L$1 : Ljava/lang/Object;
/*    */     //   337: aload #20
/*    */     //   339: aload_3
/*    */     //   340: putfield L$2 : Ljava/lang/Object;
/*    */     //   343: aload #20
/*    */     //   345: iconst_3
/*    */     //   346: putfield label : I
/*    */     //   349: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   352: dup
/*    */     //   353: aload #21
/*    */     //   355: if_acmpne -> 395
/*    */     //   358: aload #21
/*    */     //   360: areturn
/*    */     //   361: aload #20
/*    */     //   363: getfield L$2 : Ljava/lang/Object;
/*    */     //   366: checkcast java/lang/String
/*    */     //   369: astore_3
/*    */     //   370: aload #20
/*    */     //   372: getfield L$1 : Ljava/lang/Object;
/*    */     //   375: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   378: astore_1
/*    */     //   379: aload #20
/*    */     //   381: getfield L$0 : Ljava/lang/Object;
/*    */     //   384: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   387: astore_0
/*    */     //   388: aload #19
/*    */     //   390: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   393: aload #19
/*    */     //   395: pop
/*    */     //   396: new java/util/ArrayList
/*    */     //   399: dup
/*    */     //   400: invokespecial <init> : ()V
/*    */     //   403: checkcast java/util/List
/*    */     //   406: astore #4
/*    */     //   408: aload_0
/*    */     //   409: getfield numberOfSuggestions : I
/*    */     //   412: iconst_1
/*    */     //   413: if_icmple -> 456
/*    */     //   416: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*    */     //   419: aload_0
/*    */     //   420: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   423: invokevirtual isAnthropic : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Z
/*    */     //   426: ifeq -> 456
/*    */     //   429: aload_0
/*    */     //   430: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   433: invokevirtual getPromptCacheEnabled : ()Z
/*    */     //   436: ifne -> 456
/*    */     //   439: new java/lang/RuntimeException
/*    */     //   442: dup
/*    */     //   443: aload_0
/*    */     //   444: getfield numberOfSuggestions : I
/*    */     //   447: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*    */     //   452: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   455: athrow
/*    */     //   456: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   459: dup
/*    */     //   460: aload_3
/*    */     //   461: aload_0
/*    */     //   462: getfield messages : Ljava/util/List;
/*    */     //   465: checkcast java/lang/Iterable
/*    */     //   468: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   471: aload_0
/*    */     //   472: getfield tools : Ljava/util/List;
/*    */     //   475: checkcast java/lang/Iterable
/*    */     //   478: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   481: aconst_null
/*    */     //   482: aconst_null
/*    */     //   483: bipush #24
/*    */     //   485: aconst_null
/*    */     //   486: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   489: astore #5
/*    */     //   491: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*    */     //   494: aload_0
/*    */     //   495: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   498: invokevirtual isO : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Z
/*    */     //   501: ifne -> 517
/*    */     //   504: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*    */     //   507: aload_0
/*    */     //   508: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   511: invokevirtual isAnthropic : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Z
/*    */     //   514: ifeq -> 984
/*    */     //   517: aload_0
/*    */     //   518: getfield numberOfSuggestions : I
/*    */     //   521: bipush #100
/*    */     //   523: if_icmpge -> 530
/*    */     //   526: iconst_1
/*    */     //   527: goto -> 531
/*    */     //   530: iconst_0
/*    */     //   531: istore #6
/*    */     //   533: getstatic kotlin/_Assertions.ENABLED : Z
/*    */     //   536: ifeq -> 558
/*    */     //   539: iload #6
/*    */     //   541: ifne -> 558
/*    */     //   544: ldc 'Assertion failed'
/*    */     //   546: astore #7
/*    */     //   548: new java/lang/AssertionError
/*    */     //   551: dup
/*    */     //   552: aload #7
/*    */     //   554: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   557: athrow
/*    */     //   558: iconst_0
/*    */     //   559: istore #6
/*    */     //   561: aload_0
/*    */     //   562: getfield numberOfSuggestions : I
/*    */     //   565: istore #7
/*    */     //   567: iload #6
/*    */     //   569: iload #7
/*    */     //   571: if_icmpge -> 1267
/*    */     //   574: aload_0
/*    */     //   575: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   578: aconst_null
/*    */     //   579: iconst_0
/*    */     //   580: aconst_null
/*    */     //   581: aconst_null
/*    */     //   582: iconst_1
/*    */     //   583: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   586: aconst_null
/*    */     //   587: aconst_null
/*    */     //   588: aconst_null
/*    */     //   589: aconst_null
/*    */     //   590: aconst_null
/*    */     //   591: aconst_null
/*    */     //   592: aconst_null
/*    */     //   593: aconst_null
/*    */     //   594: aload_0
/*    */     //   595: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   598: invokevirtual getSeed : ()I
/*    */     //   601: iload #6
/*    */     //   603: iadd
/*    */     //   604: aconst_null
/*    */     //   605: sipush #24559
/*    */     //   608: aconst_null
/*    */     //   609: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   612: astore #8
/*    */     //   614: aload_1
/*    */     //   615: aload #5
/*    */     //   617: aload #8
/*    */     //   619: aload #20
/*    */     //   621: aload #20
/*    */     //   623: aload_0
/*    */     //   624: putfield L$0 : Ljava/lang/Object;
/*    */     //   627: aload #20
/*    */     //   629: aload_1
/*    */     //   630: putfield L$1 : Ljava/lang/Object;
/*    */     //   633: aload #20
/*    */     //   635: aload #4
/*    */     //   637: putfield L$2 : Ljava/lang/Object;
/*    */     //   640: aload #20
/*    */     //   642: aload #5
/*    */     //   644: putfield L$3 : Ljava/lang/Object;
/*    */     //   647: aload #20
/*    */     //   649: aload #8
/*    */     //   651: putfield L$4 : Ljava/lang/Object;
/*    */     //   654: aload #20
/*    */     //   656: iload #6
/*    */     //   658: putfield I$0 : I
/*    */     //   661: aload #20
/*    */     //   663: iload #7
/*    */     //   665: putfield I$1 : I
/*    */     //   668: aload #20
/*    */     //   670: iconst_4
/*    */     //   671: putfield label : I
/*    */     //   674: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   677: dup
/*    */     //   678: aload #21
/*    */     //   680: if_acmpne -> 755
/*    */     //   683: aload #21
/*    */     //   685: areturn
/*    */     //   686: aload #20
/*    */     //   688: getfield I$1 : I
/*    */     //   691: istore #7
/*    */     //   693: aload #20
/*    */     //   695: getfield I$0 : I
/*    */     //   698: istore #6
/*    */     //   700: aload #20
/*    */     //   702: getfield L$4 : Ljava/lang/Object;
/*    */     //   705: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   708: astore #8
/*    */     //   710: aload #20
/*    */     //   712: getfield L$3 : Ljava/lang/Object;
/*    */     //   715: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   718: astore #5
/*    */     //   720: aload #20
/*    */     //   722: getfield L$2 : Ljava/lang/Object;
/*    */     //   725: checkcast java/util/List
/*    */     //   728: astore #4
/*    */     //   730: aload #20
/*    */     //   732: getfield L$1 : Ljava/lang/Object;
/*    */     //   735: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   738: astore_1
/*    */     //   739: aload #20
/*    */     //   741: getfield L$0 : Ljava/lang/Object;
/*    */     //   744: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   747: astore_0
/*    */     //   748: aload #19
/*    */     //   750: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   753: aload #19
/*    */     //   755: checkcast java/util/List
/*    */     //   758: astore #9
/*    */     //   760: aload #9
/*    */     //   762: invokeinterface isEmpty : ()Z
/*    */     //   767: ifeq -> 958
/*    */     //   770: iconst_0
/*    */     //   771: istore #12
/*    */     //   773: ldc com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   775: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   778: dup
/*    */     //   779: ldc 'getInstance(...)'
/*    */     //   781: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   784: ldc 'Empty variants returned from Grazie. Retrying...'
/*    */     //   786: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   789: aload_1
/*    */     //   790: aload #5
/*    */     //   792: aload #8
/*    */     //   794: aload #20
/*    */     //   796: aload #20
/*    */     //   798: aload_0
/*    */     //   799: putfield L$0 : Ljava/lang/Object;
/*    */     //   802: aload #20
/*    */     //   804: aload_1
/*    */     //   805: putfield L$1 : Ljava/lang/Object;
/*    */     //   808: aload #20
/*    */     //   810: aload #4
/*    */     //   812: putfield L$2 : Ljava/lang/Object;
/*    */     //   815: aload #20
/*    */     //   817: aload #5
/*    */     //   819: putfield L$3 : Ljava/lang/Object;
/*    */     //   822: aload #20
/*    */     //   824: aconst_null
/*    */     //   825: putfield L$4 : Ljava/lang/Object;
/*    */     //   828: aload #20
/*    */     //   830: iload #6
/*    */     //   832: putfield I$0 : I
/*    */     //   835: aload #20
/*    */     //   837: iload #7
/*    */     //   839: putfield I$1 : I
/*    */     //   842: aload #20
/*    */     //   844: iconst_5
/*    */     //   845: putfield label : I
/*    */     //   848: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   851: dup
/*    */     //   852: aload #21
/*    */     //   854: if_acmpne -> 919
/*    */     //   857: aload #21
/*    */     //   859: areturn
/*    */     //   860: aload #20
/*    */     //   862: getfield I$1 : I
/*    */     //   865: istore #7
/*    */     //   867: aload #20
/*    */     //   869: getfield I$0 : I
/*    */     //   872: istore #6
/*    */     //   874: aload #20
/*    */     //   876: getfield L$3 : Ljava/lang/Object;
/*    */     //   879: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   882: astore #5
/*    */     //   884: aload #20
/*    */     //   886: getfield L$2 : Ljava/lang/Object;
/*    */     //   889: checkcast java/util/List
/*    */     //   892: astore #4
/*    */     //   894: aload #20
/*    */     //   896: getfield L$1 : Ljava/lang/Object;
/*    */     //   899: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   902: astore_1
/*    */     //   903: aload #20
/*    */     //   905: getfield L$0 : Ljava/lang/Object;
/*    */     //   908: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   911: astore_0
/*    */     //   912: aload #19
/*    */     //   914: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   917: aload #19
/*    */     //   919: checkcast java/util/List
/*    */     //   922: astore #11
/*    */     //   924: aload #11
/*    */     //   926: invokeinterface isEmpty : ()Z
/*    */     //   931: ifeq -> 953
/*    */     //   934: iconst_0
/*    */     //   935: istore #13
/*    */     //   937: ldc com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   939: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   942: dup
/*    */     //   943: ldc 'getInstance(...)'
/*    */     //   945: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   948: ldc 'Empty variants returned from Grazie after second attempt'
/*    */     //   950: invokevirtual error : (Ljava/lang/String;)V
/*    */     //   953: aload #11
/*    */     //   955: goto -> 960
/*    */     //   958: aload #9
/*    */     //   960: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   963: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   966: astore #10
/*    */     //   968: aload #4
/*    */     //   970: aload #10
/*    */     //   972: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   977: pop
/*    */     //   978: iinc #6, 1
/*    */     //   981: goto -> 567
/*    */     //   984: aload_0
/*    */     //   985: getfield tools : Ljava/util/List;
/*    */     //   988: invokeinterface isEmpty : ()Z
/*    */     //   993: istore #6
/*    */     //   995: getstatic kotlin/_Assertions.ENABLED : Z
/*    */     //   998: ifeq -> 1020
/*    */     //   1001: iload #6
/*    */     //   1003: ifne -> 1020
/*    */     //   1006: ldc 'Assertion failed'
/*    */     //   1008: astore #7
/*    */     //   1010: new java/lang/AssertionError
/*    */     //   1013: dup
/*    */     //   1014: aload #7
/*    */     //   1016: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   1019: athrow
/*    */     //   1020: aload_0
/*    */     //   1021: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1024: aconst_null
/*    */     //   1025: iconst_0
/*    */     //   1026: aconst_null
/*    */     //   1027: aconst_null
/*    */     //   1028: aload_0
/*    */     //   1029: getfield numberOfSuggestions : I
/*    */     //   1032: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   1035: aconst_null
/*    */     //   1036: aconst_null
/*    */     //   1037: aconst_null
/*    */     //   1038: aconst_null
/*    */     //   1039: aconst_null
/*    */     //   1040: aconst_null
/*    */     //   1041: aconst_null
/*    */     //   1042: aconst_null
/*    */     //   1043: iconst_0
/*    */     //   1044: aconst_null
/*    */     //   1045: sipush #32751
/*    */     //   1048: aconst_null
/*    */     //   1049: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1052: astore #6
/*    */     //   1054: aload_1
/*    */     //   1055: aload #5
/*    */     //   1057: aload #6
/*    */     //   1059: aload #20
/*    */     //   1061: aload #20
/*    */     //   1063: aload_0
/*    */     //   1064: putfield L$0 : Ljava/lang/Object;
/*    */     //   1067: aload #20
/*    */     //   1069: aload_1
/*    */     //   1070: putfield L$1 : Ljava/lang/Object;
/*    */     //   1073: aload #20
/*    */     //   1075: aload #4
/*    */     //   1077: putfield L$2 : Ljava/lang/Object;
/*    */     //   1080: aload #20
/*    */     //   1082: bipush #6
/*    */     //   1084: putfield label : I
/*    */     //   1087: invokevirtual sendToGrazie : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1090: dup
/*    */     //   1091: aload #21
/*    */     //   1093: if_acmpne -> 1134
/*    */     //   1096: aload #21
/*    */     //   1098: areturn
/*    */     //   1099: aload #20
/*    */     //   1101: getfield L$2 : Ljava/lang/Object;
/*    */     //   1104: checkcast java/util/List
/*    */     //   1107: astore #4
/*    */     //   1109: aload #20
/*    */     //   1111: getfield L$1 : Ljava/lang/Object;
/*    */     //   1114: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1117: astore_1
/*    */     //   1118: aload #20
/*    */     //   1120: getfield L$0 : Ljava/lang/Object;
/*    */     //   1123: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   1126: astore_0
/*    */     //   1127: aload #19
/*    */     //   1129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1132: aload #19
/*    */     //   1134: checkcast java/util/List
/*    */     //   1137: astore #7
/*    */     //   1139: aload #4
/*    */     //   1141: aload #7
/*    */     //   1143: checkcast java/lang/Iterable
/*    */     //   1146: astore #8
/*    */     //   1148: astore #17
/*    */     //   1150: iconst_0
/*    */     //   1151: istore #9
/*    */     //   1153: aload #8
/*    */     //   1155: astore #10
/*    */     //   1157: new java/util/ArrayList
/*    */     //   1160: dup
/*    */     //   1161: aload #8
/*    */     //   1163: bipush #10
/*    */     //   1165: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   1168: invokespecial <init> : (I)V
/*    */     //   1171: checkcast java/util/Collection
/*    */     //   1174: astore #11
/*    */     //   1176: iconst_0
/*    */     //   1177: istore #12
/*    */     //   1179: aload #10
/*    */     //   1181: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   1186: astore #13
/*    */     //   1188: aload #13
/*    */     //   1190: invokeinterface hasNext : ()Z
/*    */     //   1195: ifeq -> 1246
/*    */     //   1198: aload #13
/*    */     //   1200: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   1205: astore #14
/*    */     //   1207: aload #11
/*    */     //   1209: aload #14
/*    */     //   1211: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1214: astore #15
/*    */     //   1216: astore #18
/*    */     //   1218: iconst_0
/*    */     //   1219: istore #16
/*    */     //   1221: aload #15
/*    */     //   1223: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*    */     //   1226: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   1229: aload #15
/*    */     //   1231: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1234: aload #18
/*    */     //   1236: swap
/*    */     //   1237: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   1242: pop
/*    */     //   1243: goto -> 1188
/*    */     //   1246: aload #11
/*    */     //   1248: checkcast java/util/List
/*    */     //   1251: nop
/*    */     //   1252: aload #17
/*    */     //   1254: swap
/*    */     //   1255: checkcast java/util/Collection
/*    */     //   1258: invokeinterface addAll : (Ljava/util/Collection;)Z
/*    */     //   1263: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   1266: pop
/*    */     //   1267: aload_1
/*    */     //   1268: aload #4
/*    */     //   1270: aload #20
/*    */     //   1272: aload #20
/*    */     //   1274: aload_0
/*    */     //   1275: putfield L$0 : Ljava/lang/Object;
/*    */     //   1278: aload #20
/*    */     //   1280: aload_1
/*    */     //   1281: putfield L$1 : Ljava/lang/Object;
/*    */     //   1284: aload #20
/*    */     //   1286: aload #4
/*    */     //   1288: putfield L$2 : Ljava/lang/Object;
/*    */     //   1291: aload #20
/*    */     //   1293: aconst_null
/*    */     //   1294: putfield L$3 : Ljava/lang/Object;
/*    */     //   1297: aload #20
/*    */     //   1299: aconst_null
/*    */     //   1300: putfield L$4 : Ljava/lang/Object;
/*    */     //   1303: aload #20
/*    */     //   1305: bipush #7
/*    */     //   1307: putfield label : I
/*    */     //   1310: invokevirtual logChatMessages : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1313: dup
/*    */     //   1314: aload #21
/*    */     //   1316: if_acmpne -> 1357
/*    */     //   1319: aload #21
/*    */     //   1321: areturn
/*    */     //   1322: aload #20
/*    */     //   1324: getfield L$2 : Ljava/lang/Object;
/*    */     //   1327: checkcast java/util/List
/*    */     //   1330: astore #4
/*    */     //   1332: aload #20
/*    */     //   1334: getfield L$1 : Ljava/lang/Object;
/*    */     //   1337: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1340: astore_1
/*    */     //   1341: aload #20
/*    */     //   1343: getfield L$0 : Ljava/lang/Object;
/*    */     //   1346: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   1349: astore_0
/*    */     //   1350: aload #19
/*    */     //   1352: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1355: aload #19
/*    */     //   1357: pop
/*    */     //   1358: aload_0
/*    */     //   1359: getfield critic : Lkotlin/jvm/functions/Function3;
/*    */     //   1362: aload_1
/*    */     //   1363: aload #4
/*    */     //   1365: aload #20
/*    */     //   1367: aload #20
/*    */     //   1369: aload_0
/*    */     //   1370: putfield L$0 : Ljava/lang/Object;
/*    */     //   1373: aload #20
/*    */     //   1375: aconst_null
/*    */     //   1376: putfield L$1 : Ljava/lang/Object;
/*    */     //   1379: aload #20
/*    */     //   1381: aconst_null
/*    */     //   1382: putfield L$2 : Ljava/lang/Object;
/*    */     //   1385: aload #20
/*    */     //   1387: bipush #8
/*    */     //   1389: putfield label : I
/*    */     //   1392: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1397: dup
/*    */     //   1398: aload #21
/*    */     //   1400: if_acmpne -> 1422
/*    */     //   1403: aload #21
/*    */     //   1405: areturn
/*    */     //   1406: aload #20
/*    */     //   1408: getfield L$0 : Ljava/lang/Object;
/*    */     //   1411: checkcast com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*    */     //   1414: astore_0
/*    */     //   1415: aload #19
/*    */     //   1417: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1420: aload #19
/*    */     //   1422: checkcast java/util/List
/*    */     //   1425: astore #6
/*    */     //   1427: new com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*    */     //   1430: dup
/*    */     //   1431: aload_0
/*    */     //   1432: getfield systemMessage : Ljava/lang/String;
/*    */     //   1435: aload_0
/*    */     //   1436: getfield messages : Ljava/util/List;
/*    */     //   1439: checkcast java/util/Collection
/*    */     //   1442: aload #6
/*    */     //   1444: checkcast java/lang/Iterable
/*    */     //   1447: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   1450: aconst_null
/*    */     //   1451: aconst_null
/*    */     //   1452: aconst_null
/*    */     //   1453: bipush #28
/*    */     //   1455: aconst_null
/*    */     //   1456: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1459: areturn
/*    */     //   1460: new java/lang/IllegalStateException
/*    */     //   1463: dup
/*    */     //   1464: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   1467: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1470: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 121
/*    */     //   #17	-> 183
/*    */     //   #20	-> 211
/*    */     //   #22	-> 239
/*    */     //   #17	-> 280
/*    */     //   #23	-> 317
/*    */     //   #17	-> 358
/*    */     //   #25	-> 395
/*    */     //   #25	-> 406
/*    */     //   #27	-> 408
/*    */     //   #28	-> 439
/*    */     //   #31	-> 456
/*    */     //   #32	-> 491
/*    */     //   #33	-> 517
/*    */     //   #34	-> 558
/*    */     //   #35	-> 574
/*    */     //   #36	-> 582
/*    */     //   #35	-> 586
/*    */     //   #37	-> 594
/*    */     //   #35	-> 604
/*    */     //   #39	-> 614
/*    */     //   #17	-> 683
/*    */     //   #41	-> 760
/*    */     //   #42	-> 770
/*    */     //   #68	-> 773
/*    */     //   #42	-> 784
/*    */     //   #43	-> 789
/*    */     //   #17	-> 857
/*    */     //   #44	-> 924
/*    */     //   #45	-> 934
/*    */     //   #69	-> 937
/*    */     //   #45	-> 948
/*    */     //   #47	-> 953
/*    */     //   #49	-> 958
/*    */     //   #50	-> 960
/*    */     //   #41	-> 966
/*    */     //   #51	-> 968
/*    */     //   #34	-> 978
/*    */     //   #55	-> 984
/*    */     //   #56	-> 1020
/*    */     //   #57	-> 1054
/*    */     //   #17	-> 1096
/*    */     //   #58	-> 1139
/*    */     //   #70	-> 1153
/*    */     //   #71	-> 1179
/*    */     //   #72	-> 1207
/*    */     //   #58	-> 1221
/*    */     //   #72	-> 1237
/*    */     //   #73	-> 1246
/*    */     //   #70	-> 1251
/*    */     //   #58	-> 1258
/*    */     //   #61	-> 1267
/*    */     //   #17	-> 1319
/*    */     //   #63	-> 1357
/*    */     //   #17	-> 1403
/*    */     //   #65	-> 1427
/*    */     //   #17	-> 1460
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   121	65	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   204	79	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   310	51	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   388	18	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   406	50	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   456	102	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   558	128	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   748	112	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   912	36	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   948	72	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1020	79	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1127	107	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1234	18	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1252	70	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1350	56	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   1415	45	0	this	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*    */     //   121	65	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   195	88	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   301	60	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   379	27	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   406	33	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   456	102	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   558	128	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   739	121	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   903	45	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   948	72	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1020	79	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1118	116	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1234	18	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1252	70	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1341	56	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   239	44	3	systemMsg	Ljava/lang/String;
/*    */     //   292	69	3	systemMsg	Ljava/lang/String;
/*    */     //   370	36	3	systemMsg	Ljava/lang/String;
/*    */     //   406	33	3	systemMsg	Ljava/lang/String;
/*    */     //   456	35	3	systemMsg	Ljava/lang/String;
/*    */     //   408	31	4	assistantChoices	Ljava/util/List;
/*    */     //   456	102	4	assistantChoices	Ljava/util/List;
/*    */     //   558	128	4	assistantChoices	Ljava/util/List;
/*    */     //   730	130	4	assistantChoices	Ljava/util/List;
/*    */     //   894	54	4	assistantChoices	Ljava/util/List;
/*    */     //   948	72	4	assistantChoices	Ljava/util/List;
/*    */     //   1020	79	4	assistantChoices	Ljava/util/List;
/*    */     //   1109	125	4	assistantChoices	Ljava/util/List;
/*    */     //   1234	18	4	assistantChoices	Ljava/util/List;
/*    */     //   1252	70	4	assistantChoices	Ljava/util/List;
/*    */     //   1332	65	4	assistantChoices	Ljava/util/List;
/*    */     //   491	67	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   558	128	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   720	140	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   884	64	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   948	36	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   984	36	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   1020	70	5	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*    */     //   561	125	6	iteration	I
/*    */     //   700	160	6	iteration	I
/*    */     //   874	74	6	iteration	I
/*    */     //   948	36	6	iteration	I
/*    */     //   1054	36	6	overriddenParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1427	33	6	bestAnswer	Ljava/util/List;
/*    */     //   1139	11	7	choices	Ljava/util/List;
/*    */     //   614	72	8	overriddenParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   710	74	8	overriddenParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   784	67	8	overriddenParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   1150	26	8	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   760	10	9	firstAttemptVariants	Ljava/util/List;
/*    */     //   958	2	9	firstAttemptVariants	Ljava/util/List;
/*    */     //   968	9	10	choice	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1176	12	10	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   924	24	11	secondAttempt	Ljava/util/List;
/*    */     //   948	7	11	secondAttempt	Ljava/util/List;
/*    */     //   1176	72	11	destination$iv$iv	Ljava/util/Collection;
/*    */     //   1207	36	14	item$iv$iv	Ljava/lang/Object;
/*    */     //   1218	16	15	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   773	11	12	$i$f$thisLogger	I
/*    */     //   937	11	13	$i$f$thisLogger	I
/*    */     //   1221	13	16	$i$a$-map-MultiChoiceRequest$execute$2	I
/*    */     //   1179	69	12	$i$f$mapTo	I
/*    */     //   1153	99	9	$i$f$map	I
/*    */     //   0	1471	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	1410	20	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	1403	19	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MultiChoiceRequest.kt", l = {18, 22, 23, 39, 43, 57, 61, 63}, i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"}, n = {"this", "context", "this", "context", "systemMsg", "this", "context", "systemMsg", "this", "context", "assistantChoices", "chat", "overriddenParameters", "iteration", "this", "context", "assistantChoices", "chat", "iteration", "this", "context", "assistantChoices", "this", "context", "assistantChoices", "this"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.MultiChoiceRequest")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class MultiChoiceRequest$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int label;
/*    */     
/*    */     MultiChoiceRequest$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return MultiChoiceRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\MultiChoiceRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */