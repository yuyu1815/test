/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\025\022\006\020\002\032\0020\007\022\006\020\004\032\0020\005¢\006\002\020\bJ\030\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH@¢\006\002\020\rR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\007X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/api/gateway/client/DefaultUrlResolver;", "Lai/grazie/api/gateway/client/UrlResolver;", "url", "Lai/grazie/api/gateway/client/PlatformConfigurationUrl;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "(Lai/grazie/api/gateway/client/PlatformConfigurationUrl;Lai/grazie/client/common/SuspendableHTTPClient;)V", "", "(Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;)V", "resolve", "Lai/grazie/api/gateway/client/ResolutionResult;", "provider", "Lai/grazie/api/gateway/client/CloudProvider;", "(Lai/grazie/api/gateway/client/CloudProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nUrlResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlResolver.kt\nai/grazie/api/gateway/client/DefaultUrlResolver\n+ 2 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,79:1\n68#2,7:80\n1053#3:87\n1053#3:88\n295#3:89\n296#3:91\n326#4:90\n*S KotlinDebug\n*F\n+ 1 UrlResolver.kt\nai/grazie/api/gateway/client/DefaultUrlResolver\n*L\n22#1:80,7\n24#1:87\n29#1:88\n32#1:89\n32#1:91\n36#1:90\n*E\n"})
/*    */ public final class DefaultUrlResolver implements UrlResolver {
/*    */   @NotNull
/*    */   private final String url;
/*    */   
/* 17 */   public DefaultUrlResolver(@NotNull String url, @NotNull SuspendableHTTPClient client) { this.url = url; this.client = client; } @NotNull
/* 18 */   private final SuspendableHTTPClient client; public DefaultUrlResolver(@NotNull PlatformConfigurationUrl url, @NotNull SuspendableHTTPClient client) { this(url.getUrl() + "/config/JetBrainsAIPlatform.json", client); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object resolve(@Nullable CloudProvider provider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/api/gateway/client/DefaultUrlResolver$resolve$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/api/gateway/client/DefaultUrlResolver$resolve$1
/*    */     //   11: astore #17
/*    */     //   13: aload #17
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #17
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/DefaultUrlResolver$resolve$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/DefaultUrlResolver;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #17
/*    */     //   50: aload #17
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #16
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #18
/*    */     //   62: aload #17
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 695, 0 -> 92, 1 -> 180, 2 -> 486
/*    */     //   92: aload #16
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   101: astore #4
/*    */     //   103: aload_0
/*    */     //   104: getfield url : Ljava/lang/String;
/*    */     //   107: astore #5
/*    */     //   109: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   112: checkcast ai/grazie/utils/json/JSON
/*    */     //   115: astore #7
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #6
/*    */     //   130: iconst_0
/*    */     //   131: istore #8
/*    */     //   133: aload #4
/*    */     //   135: aload #5
/*    */     //   137: aload #6
/*    */     //   139: aload #17
/*    */     //   141: aload #17
/*    */     //   143: aload_0
/*    */     //   144: putfield L$0 : Ljava/lang/Object;
/*    */     //   147: aload #17
/*    */     //   149: aload_1
/*    */     //   150: putfield L$1 : Ljava/lang/Object;
/*    */     //   153: aload #17
/*    */     //   155: aload #7
/*    */     //   157: putfield L$2 : Ljava/lang/Object;
/*    */     //   160: aload #17
/*    */     //   162: iconst_1
/*    */     //   163: putfield label : I
/*    */     //   166: invokeinterface get : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   171: dup
/*    */     //   172: aload #18
/*    */     //   174: if_acmpne -> 218
/*    */     //   177: aload #18
/*    */     //   179: areturn
/*    */     //   180: iconst_0
/*    */     //   181: istore #8
/*    */     //   183: aload #17
/*    */     //   185: getfield L$2 : Ljava/lang/Object;
/*    */     //   188: checkcast ai/grazie/utils/json/JSON
/*    */     //   191: astore #7
/*    */     //   193: aload #17
/*    */     //   195: getfield L$1 : Ljava/lang/Object;
/*    */     //   198: checkcast ai/grazie/api/gateway/client/CloudProvider
/*    */     //   201: astore_1
/*    */     //   202: aload #17
/*    */     //   204: getfield L$0 : Ljava/lang/Object;
/*    */     //   207: checkcast ai/grazie/api/gateway/client/DefaultUrlResolver
/*    */     //   210: astore_0
/*    */     //   211: aload #16
/*    */     //   213: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   216: aload #16
/*    */     //   218: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   221: astore #9
/*    */     //   223: aload #7
/*    */     //   225: getstatic ai/grazie/api/gateway/client/Response.Companion : Lai/grazie/api/gateway/client/Response$Companion;
/*    */     //   228: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   231: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   234: aload #9
/*    */     //   236: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   239: dup
/*    */     //   240: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   243: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   246: checkcast ai/grazie/api/gateway/client/Response
/*    */     //   249: astore_3
/*    */     //   250: aload_1
/*    */     //   251: ifnull -> 333
/*    */     //   254: aload_3
/*    */     //   255: invokevirtual getProviders : ()Ljava/util/Map;
/*    */     //   258: dup
/*    */     //   259: ifnull -> 305
/*    */     //   262: aload_1
/*    */     //   263: invokevirtual getKey : ()Ljava/lang/String;
/*    */     //   266: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   271: checkcast java/util/List
/*    */     //   274: dup
/*    */     //   275: ifnull -> 305
/*    */     //   278: checkcast java/lang/Iterable
/*    */     //   281: astore #8
/*    */     //   283: iconst_0
/*    */     //   284: istore #9
/*    */     //   286: aload #8
/*    */     //   288: new ai/grazie/api/gateway/client/DefaultUrlResolver$resolve$$inlined$sortedBy$1
/*    */     //   291: dup
/*    */     //   292: invokespecial <init> : ()V
/*    */     //   295: checkcast java/util/Comparator
/*    */     //   298: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*    */     //   301: dup
/*    */     //   302: ifnonnull -> 360
/*    */     //   305: pop
/*    */     //   306: new ai/grazie/api/gateway/client/ResolutionResult$Failure
/*    */     //   309: dup
/*    */     //   310: new java/lang/IllegalArgumentException
/*    */     //   313: dup
/*    */     //   314: aload_1
/*    */     //   315: invokevirtual getKey : ()Ljava/lang/String;
/*    */     //   318: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   323: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   326: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   329: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   332: areturn
/*    */     //   333: aload_3
/*    */     //   334: invokevirtual getUrls : ()Ljava/util/List;
/*    */     //   337: checkcast java/lang/Iterable
/*    */     //   340: astore #5
/*    */     //   342: iconst_0
/*    */     //   343: istore #6
/*    */     //   345: aload #5
/*    */     //   347: new ai/grazie/api/gateway/client/DefaultUrlResolver$resolve$$inlined$sortedBy$2
/*    */     //   350: dup
/*    */     //   351: invokespecial <init> : ()V
/*    */     //   354: checkcast java/util/Comparator
/*    */     //   357: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*    */     //   360: astore #4
/*    */     //   362: new java/util/ArrayList
/*    */     //   365: dup
/*    */     //   366: invokespecial <init> : ()V
/*    */     //   369: checkcast java/util/List
/*    */     //   372: astore #5
/*    */     //   374: aload #4
/*    */     //   376: checkcast java/lang/Iterable
/*    */     //   379: astore #7
/*    */     //   381: iconst_0
/*    */     //   382: istore #8
/*    */     //   384: aload #7
/*    */     //   386: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   391: astore #9
/*    */     //   393: aload #9
/*    */     //   395: invokeinterface hasNext : ()Z
/*    */     //   400: ifeq -> 603
/*    */     //   403: aload #9
/*    */     //   405: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   410: astore #10
/*    */     //   412: aload #10
/*    */     //   414: checkcast ai/grazie/api/gateway/client/PlatformUrl
/*    */     //   417: astore #11
/*    */     //   419: iconst_0
/*    */     //   420: istore #12
/*    */     //   422: nop
/*    */     //   423: new ai/grazie/api/gateway/client/PingClient
/*    */     //   426: dup
/*    */     //   427: aload #11
/*    */     //   429: invokevirtual getUrl : ()Ljava/lang/String;
/*    */     //   432: aload_0
/*    */     //   433: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   436: invokespecial <init> : (Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;)V
/*    */     //   439: aload #17
/*    */     //   441: aload #17
/*    */     //   443: aload_0
/*    */     //   444: putfield L$0 : Ljava/lang/Object;
/*    */     //   447: aload #17
/*    */     //   449: aload #5
/*    */     //   451: putfield L$1 : Ljava/lang/Object;
/*    */     //   454: aload #17
/*    */     //   456: aload #9
/*    */     //   458: putfield L$2 : Ljava/lang/Object;
/*    */     //   461: aload #17
/*    */     //   463: aload #10
/*    */     //   465: putfield L$3 : Ljava/lang/Object;
/*    */     //   468: aload #17
/*    */     //   470: iconst_2
/*    */     //   471: putfield label : I
/*    */     //   474: invokevirtual ping : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   477: dup
/*    */     //   478: aload #18
/*    */     //   480: if_acmpne -> 536
/*    */     //   483: aload #18
/*    */     //   485: areturn
/*    */     //   486: iconst_0
/*    */     //   487: istore #8
/*    */     //   489: iconst_0
/*    */     //   490: istore #12
/*    */     //   492: aload #17
/*    */     //   494: getfield L$3 : Ljava/lang/Object;
/*    */     //   497: astore #10
/*    */     //   499: aload #17
/*    */     //   501: getfield L$2 : Ljava/lang/Object;
/*    */     //   504: checkcast java/util/Iterator
/*    */     //   507: astore #9
/*    */     //   509: aload #17
/*    */     //   511: getfield L$1 : Ljava/lang/Object;
/*    */     //   514: checkcast java/util/List
/*    */     //   517: astore #5
/*    */     //   519: aload #17
/*    */     //   521: getfield L$0 : Ljava/lang/Object;
/*    */     //   524: checkcast ai/grazie/api/gateway/client/DefaultUrlResolver
/*    */     //   527: astore_0
/*    */     //   528: nop
/*    */     //   529: aload #16
/*    */     //   531: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   534: aload #16
/*    */     //   536: checkcast java/lang/Boolean
/*    */     //   539: invokevirtual booleanValue : ()Z
/*    */     //   542: istore #13
/*    */     //   544: goto -> 584
/*    */     //   547: astore #14
/*    */     //   549: aload #14
/*    */     //   551: instanceof java/util/concurrent/CancellationException
/*    */     //   554: ifeq -> 571
/*    */     //   557: iconst_0
/*    */     //   558: istore #15
/*    */     //   560: aload #17
/*    */     //   562: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*    */     //   567: nop
/*    */     //   568: invokestatic ensureActive : (Lkotlin/coroutines/CoroutineContext;)V
/*    */     //   571: aload #5
/*    */     //   573: aload #14
/*    */     //   575: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   580: pop
/*    */     //   581: iconst_0
/*    */     //   582: istore #13
/*    */     //   584: iload #13
/*    */     //   586: ifeq -> 593
/*    */     //   589: iconst_1
/*    */     //   590: goto -> 594
/*    */     //   593: iconst_0
/*    */     //   594: nop
/*    */     //   595: ifeq -> 393
/*    */     //   598: aload #10
/*    */     //   600: goto -> 604
/*    */     //   603: aconst_null
/*    */     //   604: checkcast ai/grazie/api/gateway/client/PlatformUrl
/*    */     //   607: astore #6
/*    */     //   609: nop
/*    */     //   610: aload #6
/*    */     //   612: ifnonnull -> 630
/*    */     //   615: new ai/grazie/api/gateway/client/ResolutionResult$Failure
/*    */     //   618: dup
/*    */     //   619: aload #5
/*    */     //   621: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   624: checkcast ai/grazie/api/gateway/client/ResolutionResult
/*    */     //   627: goto -> 694
/*    */     //   630: aload #5
/*    */     //   632: checkcast java/util/Collection
/*    */     //   635: invokeinterface isEmpty : ()Z
/*    */     //   640: ifne -> 647
/*    */     //   643: iconst_1
/*    */     //   644: goto -> 648
/*    */     //   647: iconst_0
/*    */     //   648: ifeq -> 679
/*    */     //   651: aload #6
/*    */     //   653: invokevirtual getDeprecated : ()Z
/*    */     //   656: ifeq -> 679
/*    */     //   659: new ai/grazie/api/gateway/client/ResolutionResult$FallbackUrl
/*    */     //   662: dup
/*    */     //   663: aload #6
/*    */     //   665: invokevirtual getUrl : ()Ljava/lang/String;
/*    */     //   668: aload #5
/*    */     //   670: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*    */     //   673: checkcast ai/grazie/api/gateway/client/ResolutionResult
/*    */     //   676: goto -> 694
/*    */     //   679: new ai/grazie/api/gateway/client/ResolutionResult$Success
/*    */     //   682: dup
/*    */     //   683: aload #6
/*    */     //   685: invokevirtual getUrl : ()Ljava/lang/String;
/*    */     //   688: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   691: checkcast ai/grazie/api/gateway/client/ResolutionResult
/*    */     //   694: areturn
/*    */     //   695: new java/lang/IllegalStateException
/*    */     //   698: dup
/*    */     //   699: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   702: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   705: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 60
/*    */     //   #21	-> 97
/*    */     //   #22	-> 103
/*    */     //   #80	-> 117
/*    */     //   #82	-> 117
/*    */     //   #80	-> 130
/*    */     //   #80	-> 130
/*    */     //   #85	-> 133
/*    */     //   #20	-> 177
/*    */     //   #86	-> 223
/*    */     //   #22	-> 246
/*    */     //   #21	-> 249
/*    */     //   #23	-> 250
/*    */     //   #24	-> 254
/*    */     //   #87	-> 286
/*    */     //   #87	-> 298
/*    */     //   #24	-> 301
/*    */     //   #25	-> 306
/*    */     //   #27	-> 333
/*    */     //   #28	-> 334
/*    */     //   #29	-> 342
/*    */     //   #88	-> 345
/*    */     //   #88	-> 357
/*    */     //   #23	-> 360
/*    */     //   #31	-> 362
/*    */     //   #31	-> 372
/*    */     //   #32	-> 374
/*    */     //   #89	-> 384
/*    */     //   #33	-> 422
/*    */     //   #34	-> 423
/*    */     //   #20	-> 483
/*    */     //   #34	-> 536
/*    */     //   #35	-> 547
/*    */     //   #36	-> 549
/*    */     //   #90	-> 560
/*    */     //   #90	-> 567
/*    */     //   #36	-> 568
/*    */     //   #37	-> 571
/*    */     //   #38	-> 581
/*    */     //   #39	-> 594
/*    */     //   #89	-> 595
/*    */     //   #91	-> 603
/*    */     //   #32	-> 604
/*    */     //   #41	-> 609
/*    */     //   #42	-> 610
/*    */     //   #43	-> 630
/*    */     //   #43	-> 648
/*    */     //   #44	-> 679
/*    */     //   #41	-> 694
/*    */     //   #20	-> 695
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	83	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   211	35	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   246	55	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   301	4	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   333	27	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   360	12	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   372	114	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   528	67	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   595	8	0	this	Lai/grazie/api/gateway/client/DefaultUrlResolver;
/*    */     //   97	83	1	provider	Lai/grazie/api/gateway/client/CloudProvider;
/*    */     //   202	44	1	provider	Lai/grazie/api/gateway/client/CloudProvider;
/*    */     //   246	55	1	provider	Lai/grazie/api/gateway/client/CloudProvider;
/*    */     //   301	4	1	provider	Lai/grazie/api/gateway/client/CloudProvider;
/*    */     //   305	28	1	provider	Lai/grazie/api/gateway/client/CloudProvider;
/*    */     //   250	8	3	config	Lai/grazie/api/gateway/client/Response;
/*    */     //   333	1	3	config	Lai/grazie/api/gateway/client/Response;
/*    */     //   103	68	4	$this$get_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   362	10	4	urls	Ljava/util/List;
/*    */     //   372	9	4	urls	Ljava/util/List;
/*    */     //   117	54	5	url$iv	Ljava/lang/String;
/*    */     //   342	18	5	$this$sortedBy$iv	Ljava/lang/Iterable;
/*    */     //   374	112	5	exceptions	Ljava/util/List;
/*    */     //   519	76	5	exceptions	Ljava/util/List;
/*    */     //   595	8	5	exceptions	Ljava/util/List;
/*    */     //   603	1	5	exceptions	Ljava/util/List;
/*    */     //   604	26	5	exceptions	Ljava/util/List;
/*    */     //   630	18	5	exceptions	Ljava/util/List;
/*    */     //   648	31	5	exceptions	Ljava/util/List;
/*    */     //   130	41	6	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   609	21	6	url	Lai/grazie/api/gateway/client/PlatformUrl;
/*    */     //   630	18	6	url	Lai/grazie/api/gateway/client/PlatformUrl;
/*    */     //   648	31	6	url	Lai/grazie/api/gateway/client/PlatformUrl;
/*    */     //   679	15	6	url	Lai/grazie/api/gateway/client/PlatformUrl;
/*    */     //   117	63	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   193	53	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   381	12	7	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */     //   283	18	8	$this$sortedBy$iv	Ljava/lang/Iterable;
/*    */     //   223	23	9	response$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   412	74	10	element$iv	Ljava/lang/Object;
/*    */     //   499	104	10	element$iv	Ljava/lang/Object;
/*    */     //   419	58	11	it	Lai/grazie/api/gateway/client/PlatformUrl;
/*    */     //   549	35	14	e	Ljava/lang/Throwable;
/*    */     //   133	47	8	$i$f$get	I
/*    */     //   286	15	9	$i$f$sortedBy	I
/*    */     //   345	15	6	$i$f$sortedBy	I
/*    */     //   560	8	15	$i$f$currentCoroutineContext	I
/*    */     //   422	64	12	$i$a$-firstOrNull-DefaultUrlResolver$resolve$url$1	I
/*    */     //   384	102	8	$i$f$firstOrNull	I
/*    */     //   0	706	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	645	17	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	638	16	$result	Ljava/lang/Object;
/*    */     //   183	63	8	$i$f$get	I
/*    */     //   492	103	12	$i$a$-firstOrNull-DefaultUrlResolver$resolve$url$1	I
/*    */     //   489	115	8	$i$f$firstOrNull	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   422	477	547	java/lang/Throwable
/*    */     //   528	544	547	java/lang/Throwable
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "UrlResolver.kt", l = {85, 34}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$3"}, n = {"this", "provider", "json$iv", "this", "exceptions", "element$iv"}, m = "resolve", c = "ai.grazie.api.gateway.client.DefaultUrlResolver")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class DefaultUrlResolver$resolve$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     int label;
/*    */     
/*    */     DefaultUrlResolver$resolve$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DefaultUrlResolver.this.resolve(null, (Continuation<? super ResolutionResult>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\DefaultUrlResolver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */