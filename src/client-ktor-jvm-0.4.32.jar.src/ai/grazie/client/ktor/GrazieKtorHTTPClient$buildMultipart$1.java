/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.client.common.model.Multipart;
/*     */ import io.ktor.client.request.forms.FormBuilder;
/*     */ import io.ktor.utils.io.core.BytePacketBuilderKt;
/*     */ import io.ktor.utils.io.core.StringsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.io.Buffer;
/*     */ import kotlinx.io.Sink;
/*     */ import kotlinx.io.Source;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/request/forms/FormBuilder;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,216:1\n13402#2:217\n13402#2,2:219\n13402#2,2:222\n13403#2:224\n30#3:218\n30#3:221\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n*L\n102#1:217\n105#1:219,2\n114#1:222,2\n102#1:224\n104#1:218\n113#1:221\n*E\n"})
/*     */ final class GrazieKtorHTTPClient$buildMultipart$1 extends Lambda implements Function1<FormBuilder, Unit> {
/*     */   public final void invoke(FormBuilder $this$formData) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$formData'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield $multipart : Lai/grazie/client/common/model/Multipart;
/*     */     //   10: invokevirtual getParts : ()[Lai/grazie/client/common/model/Multipart$PartItem;
/*     */     //   13: astore_2
/*     */     //   14: iconst_0
/*     */     //   15: istore_3
/*     */     //   16: iconst_0
/*     */     //   17: istore #4
/*     */     //   19: aload_2
/*     */     //   20: arraylength
/*     */     //   21: istore #5
/*     */     //   23: iload #4
/*     */     //   25: iload #5
/*     */     //   27: if_icmpge -> 430
/*     */     //   30: aload_2
/*     */     //   31: iload #4
/*     */     //   33: aaload
/*     */     //   34: astore #6
/*     */     //   36: aload #6
/*     */     //   38: astore #7
/*     */     //   40: iconst_0
/*     */     //   41: istore #8
/*     */     //   43: aload #7
/*     */     //   45: astore #9
/*     */     //   47: aload #9
/*     */     //   49: instanceof ai/grazie/client/common/model/Multipart$FormPart
/*     */     //   52: ifeq -> 222
/*     */     //   55: aload_1
/*     */     //   56: aload #7
/*     */     //   58: invokeinterface getKey : ()Ljava/lang/String;
/*     */     //   63: aload #7
/*     */     //   65: invokeinterface getValue : ()Ljava/lang/String;
/*     */     //   70: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */     //   73: astore #10
/*     */     //   75: iconst_0
/*     */     //   76: istore #11
/*     */     //   78: new io/ktor/http/HeadersBuilder
/*     */     //   81: dup
/*     */     //   82: iconst_0
/*     */     //   83: iconst_1
/*     */     //   84: aconst_null
/*     */     //   85: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   88: astore #12
/*     */     //   90: aload #12
/*     */     //   92: astore #13
/*     */     //   94: astore #14
/*     */     //   96: astore #15
/*     */     //   98: astore #16
/*     */     //   100: iconst_0
/*     */     //   101: istore #17
/*     */     //   103: aload #7
/*     */     //   105: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   110: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */     //   113: astore #18
/*     */     //   115: iconst_0
/*     */     //   116: istore #19
/*     */     //   118: iconst_0
/*     */     //   119: istore #20
/*     */     //   121: aload #18
/*     */     //   123: arraylength
/*     */     //   124: istore #21
/*     */     //   126: iload #20
/*     */     //   128: iload #21
/*     */     //   130: if_icmpge -> 198
/*     */     //   133: aload #18
/*     */     //   135: iload #20
/*     */     //   137: aaload
/*     */     //   138: astore #22
/*     */     //   140: aload #22
/*     */     //   142: astore #23
/*     */     //   144: iconst_0
/*     */     //   145: istore #24
/*     */     //   147: aload #13
/*     */     //   149: aload #23
/*     */     //   151: aload #7
/*     */     //   153: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   158: aload #23
/*     */     //   160: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   163: dup
/*     */     //   164: ifnull -> 180
/*     */     //   167: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   170: dup
/*     */     //   171: ifnull -> 180
/*     */     //   174: checkcast java/lang/Iterable
/*     */     //   177: goto -> 187
/*     */     //   180: pop
/*     */     //   181: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   184: checkcast java/lang/Iterable
/*     */     //   187: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */     //   190: nop
/*     */     //   191: nop
/*     */     //   192: iinc #20, 1
/*     */     //   195: goto -> 126
/*     */     //   198: nop
/*     */     //   199: nop
/*     */     //   200: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   203: astore #25
/*     */     //   205: aload #16
/*     */     //   207: aload #15
/*     */     //   209: aload #14
/*     */     //   211: aload #12
/*     */     //   213: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */     //   216: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/Headers;)V
/*     */     //   219: goto -> 422
/*     */     //   222: aload #9
/*     */     //   224: instanceof ai/grazie/client/common/model/Multipart$FilePart
/*     */     //   227: ifeq -> 422
/*     */     //   230: aload_1
/*     */     //   231: aload #7
/*     */     //   233: invokeinterface getKey : ()Ljava/lang/String;
/*     */     //   238: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */     //   241: astore #10
/*     */     //   243: iconst_0
/*     */     //   244: istore #11
/*     */     //   246: new io/ktor/http/HeadersBuilder
/*     */     //   249: dup
/*     */     //   250: iconst_0
/*     */     //   251: iconst_1
/*     */     //   252: aconst_null
/*     */     //   253: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   256: astore #12
/*     */     //   258: aload #12
/*     */     //   260: astore #13
/*     */     //   262: astore #15
/*     */     //   264: astore #16
/*     */     //   266: iconst_0
/*     */     //   267: istore #17
/*     */     //   269: aload #7
/*     */     //   271: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   276: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */     //   279: astore #18
/*     */     //   281: iconst_0
/*     */     //   282: istore #19
/*     */     //   284: iconst_0
/*     */     //   285: istore #20
/*     */     //   287: aload #18
/*     */     //   289: arraylength
/*     */     //   290: istore #21
/*     */     //   292: iload #20
/*     */     //   294: iload #21
/*     */     //   296: if_icmpge -> 364
/*     */     //   299: aload #18
/*     */     //   301: iload #20
/*     */     //   303: aaload
/*     */     //   304: astore #22
/*     */     //   306: aload #22
/*     */     //   308: astore #23
/*     */     //   310: iconst_0
/*     */     //   311: istore #24
/*     */     //   313: aload #13
/*     */     //   315: aload #23
/*     */     //   317: aload #7
/*     */     //   319: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   324: aload #23
/*     */     //   326: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   329: dup
/*     */     //   330: ifnull -> 346
/*     */     //   333: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   336: dup
/*     */     //   337: ifnull -> 346
/*     */     //   340: checkcast java/lang/Iterable
/*     */     //   343: goto -> 353
/*     */     //   346: pop
/*     */     //   347: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   350: checkcast java/lang/Iterable
/*     */     //   353: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */     //   356: nop
/*     */     //   357: nop
/*     */     //   358: iinc #20, 1
/*     */     //   361: goto -> 292
/*     */     //   364: nop
/*     */     //   365: aload #13
/*     */     //   367: getstatic io/ktor/http/HttpHeaders.INSTANCE : Lio/ktor/http/HttpHeaders;
/*     */     //   370: invokevirtual getContentDisposition : ()Ljava/lang/String;
/*     */     //   373: aload #7
/*     */     //   375: checkcast ai/grazie/client/common/model/Multipart$FilePart
/*     */     //   378: invokevirtual getFileName : ()Ljava/lang/String;
/*     */     //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   386: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   389: nop
/*     */     //   390: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   393: astore #14
/*     */     //   395: aload #16
/*     */     //   397: aload #15
/*     */     //   399: aload #12
/*     */     //   401: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */     //   404: aconst_null
/*     */     //   405: new ai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3
/*     */     //   408: dup
/*     */     //   409: aload #7
/*     */     //   411: invokespecial <init> : (Lai/grazie/client/common/model/Multipart$PartItem;)V
/*     */     //   414: checkcast kotlin/jvm/functions/Function0
/*     */     //   417: iconst_4
/*     */     //   418: aconst_null
/*     */     //   419: invokestatic appendInput$default : (Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */     //   422: nop
/*     */     //   423: nop
/*     */     //   424: iinc #4, 1
/*     */     //   427: goto -> 23
/*     */     //   430: nop
/*     */     //   431: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 6
/*     */     //   #217	-> 16
/*     */     //   #103	-> 43
/*     */     //   #104	-> 47
/*     */     //   #218	-> 78
/*     */     //   #105	-> 103
/*     */     //   #219	-> 118
/*     */     //   #106	-> 147
/*     */     //   #107	-> 190
/*     */     //   #219	-> 191
/*     */     //   #220	-> 198
/*     */     //   #108	-> 199
/*     */     //   #218	-> 211
/*     */     //   #218	-> 213
/*     */     //   #104	-> 216
/*     */     //   #110	-> 222
/*     */     //   #111	-> 230
/*     */     //   #112	-> 231
/*     */     //   #113	-> 238
/*     */     //   #221	-> 246
/*     */     //   #114	-> 269
/*     */     //   #222	-> 284
/*     */     //   #115	-> 313
/*     */     //   #116	-> 356
/*     */     //   #222	-> 357
/*     */     //   #223	-> 364
/*     */     //   #117	-> 365
/*     */     //   #118	-> 389
/*     */     //   #221	-> 399
/*     */     //   #221	-> 401
/*     */     //   #111	-> 404
/*     */     //   #124	-> 422
/*     */     //   #217	-> 423
/*     */     //   #224	-> 430
/*     */     //   #125	-> 431
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   147	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$1$1	I
/*     */     //   144	47	23	e	Ljava/lang/String;
/*     */     //   140	52	22	element$iv	Ljava/lang/Object;
/*     */     //   118	81	19	$i$f$forEach	I
/*     */     //   115	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */     //   103	97	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$1	I
/*     */     //   100	100	13	$this$invoke_u24lambda_u244_u24lambda_u241	Lio/ktor/http/HeadersBuilder;
/*     */     //   78	138	11	$i$f$build	I
/*     */     //   75	141	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */     //   313	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$2$1	I
/*     */     //   310	47	23	e	Ljava/lang/String;
/*     */     //   306	52	22	element$iv	Ljava/lang/Object;
/*     */     //   284	81	19	$i$f$forEach	I
/*     */     //   281	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */     //   269	121	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$2	I
/*     */     //   266	124	13	$this$invoke_u24lambda_u244_u24lambda_u243	Lio/ktor/http/HeadersBuilder;
/*     */     //   246	158	11	$i$f$build	I
/*     */     //   243	161	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */     //   43	380	8	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1	I
/*     */     //   40	383	7	it	Lai/grazie/client/common/model/Multipart$PartItem;
/*     */     //   36	388	6	element$iv	Ljava/lang/Object;
/*     */     //   16	415	3	$i$f$forEach	I
/*     */     //   14	417	2	$this$forEach$iv	[Ljava/lang/Object;
/*     */     //   0	432	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1;
/*     */     //   0	432	1	$this$formData	Lio/ktor/client/request/forms/FormBuilder;
/*     */   }
/*     */   
/*     */   GrazieKtorHTTPClient$buildMultipart$1(Multipart $multipart) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$buildMultipart$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */