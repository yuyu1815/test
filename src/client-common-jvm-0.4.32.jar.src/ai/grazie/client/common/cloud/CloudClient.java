/*    */ package ai.grazie.client.common.cloud;
/*    */ 
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.model.cloud.AuthVersion;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\007\n\002\030\002\n\000\b'\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\016\020\b\032\n\022\006\b\001\022\0020\0070\t¢\006\002\020\nJ\016\020\017\032\0020\0032\006\020\020\032\0020\021R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\fR\016\020\006\032\0020\007X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\022"}, d2 = {"Lai/grazie/client/common/cloud/CloudClient;", "", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "supportedAuthVersions", "", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;[Lai/grazie/model/cloud/AuthVersion;)V", "getAuthType", "()Lai/grazie/model/cloud/AuthType;", "getServerUrl", "()Ljava/lang/String;", "url", "api", "Lai/grazie/model/cloud/API;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nCloudClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudClient.kt\nai/grazie/client/common/cloud/CloudClient\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1104#2,3:43\n1#3:46\n*S KotlinDebug\n*F\n+ 1 CloudClient.kt\nai/grazie/client/common/cloud/CloudClient\n*L\n29#1:43,3\n*E\n"})
/*    */ public abstract class CloudClient {
/*    */   @NotNull
/*    */   private final String serverUrl;
/*    */   @Nullable
/*    */   private final AuthType authType;
/*    */   
/*    */   @NotNull
/* 20 */   public final String getServerUrl() { return this.serverUrl; }
/*    */   @NotNull private final AuthVersion authVersion; public CloudClient(@NotNull String serverUrl, @Nullable AuthType authType, @NotNull AuthVersion authVersion, @NotNull AuthVersion[] supportedAuthVersions) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'serverUrl'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_3
/*    */     //   7: ldc 'authVersion'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload #4
/*    */     //   14: ldc 'supportedAuthVersions'
/*    */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   19: aload_0
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: aload_0
/*    */     //   24: aload_1
/*    */     //   25: putfield serverUrl : Ljava/lang/String;
/*    */     //   28: aload_0
/*    */     //   29: aload_2
/*    */     //   30: putfield authType : Lai/grazie/model/cloud/AuthType;
/*    */     //   33: aload_0
/*    */     //   34: aload_3
/*    */     //   35: putfield authVersion : Lai/grazie/model/cloud/AuthVersion;
/*    */     //   38: nop
/*    */     //   39: aload_0
/*    */     //   40: getfield serverUrl : Ljava/lang/String;
/*    */     //   43: ldc '://'
/*    */     //   45: aconst_null
/*    */     //   46: iconst_2
/*    */     //   47: aconst_null
/*    */     //   48: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   51: ldc ':'
/*    */     //   53: aconst_null
/*    */     //   54: iconst_2
/*    */     //   55: aconst_null
/*    */     //   56: invokestatic substringBefore$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   59: astore #5
/*    */     //   61: aload_0
/*    */     //   62: getfield serverUrl : Ljava/lang/String;
/*    */     //   65: ldc 'https://'
/*    */     //   67: iconst_0
/*    */     //   68: iconst_2
/*    */     //   69: aconst_null
/*    */     //   70: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */     //   73: ifne -> 151
/*    */     //   76: aload #5
/*    */     //   78: checkcast java/lang/CharSequence
/*    */     //   81: astore #6
/*    */     //   83: iconst_0
/*    */     //   84: istore #7
/*    */     //   86: iconst_0
/*    */     //   87: istore #8
/*    */     //   89: iconst_0
/*    */     //   90: istore #9
/*    */     //   92: iload #9
/*    */     //   94: aload #6
/*    */     //   96: invokeinterface length : ()I
/*    */     //   101: if_icmpge -> 146
/*    */     //   104: aload #6
/*    */     //   106: iload #9
/*    */     //   108: invokeinterface charAt : (I)C
/*    */     //   113: istore #10
/*    */     //   115: iload #10
/*    */     //   117: istore #11
/*    */     //   119: iconst_0
/*    */     //   120: istore #12
/*    */     //   122: iload #11
/*    */     //   124: bipush #46
/*    */     //   126: if_icmpne -> 133
/*    */     //   129: iconst_1
/*    */     //   130: goto -> 134
/*    */     //   133: iconst_0
/*    */     //   134: ifeq -> 140
/*    */     //   137: iinc #8, 1
/*    */     //   140: iinc #9, 1
/*    */     //   143: goto -> 92
/*    */     //   146: iload #8
/*    */     //   148: ifne -> 155
/*    */     //   151: iconst_1
/*    */     //   152: goto -> 156
/*    */     //   155: iconst_0
/*    */     //   156: ifne -> 179
/*    */     //   159: iconst_0
/*    */     //   160: istore #7
/*    */     //   162: ldc 'http:// protocol can be used only for local network traffic (e.g., within private subnet)'
/*    */     //   164: astore #7
/*    */     //   166: new java/lang/IllegalArgumentException
/*    */     //   169: dup
/*    */     //   170: aload #7
/*    */     //   172: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   175: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   178: athrow
/*    */     //   179: aload #4
/*    */     //   181: arraylength
/*    */     //   182: ifne -> 189
/*    */     //   185: iconst_1
/*    */     //   186: goto -> 190
/*    */     //   189: iconst_0
/*    */     //   190: ifne -> 205
/*    */     //   193: aload #4
/*    */     //   195: aload_0
/*    */     //   196: getfield authVersion : Lai/grazie/model/cloud/AuthVersion;
/*    */     //   199: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   202: ifeq -> 209
/*    */     //   205: iconst_1
/*    */     //   206: goto -> 210
/*    */     //   209: iconst_0
/*    */     //   210: ifne -> 254
/*    */     //   213: iconst_0
/*    */     //   214: istore #7
/*    */     //   216: aload #4
/*    */     //   218: ldc ', '
/*    */     //   220: checkcast java/lang/CharSequence
/*    */     //   223: aconst_null
/*    */     //   224: aconst_null
/*    */     //   225: iconst_0
/*    */     //   226: aconst_null
/*    */     //   227: aconst_null
/*    */     //   228: bipush #62
/*    */     //   230: aconst_null
/*    */     //   231: invokestatic joinToString$default : ([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   234: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   239: astore #7
/*    */     //   241: new java/lang/IllegalArgumentException
/*    */     //   244: dup
/*    */     //   245: aload #7
/*    */     //   247: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   250: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   253: athrow
/*    */     //   254: nop
/*    */     //   255: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 19
/*    */     //   #20	-> 23
/*    */     //   #21	-> 28
/*    */     //   #22	-> 33
/*    */     //   #25	-> 38
/*    */     //   #26	-> 39
/*    */     //   #28	-> 61
/*    */     //   #29	-> 76
/*    */     //   #43	-> 86
/*    */     //   #44	-> 89
/*    */     //   #29	-> 122
/*    */     //   #44	-> 134
/*    */     //   #45	-> 146
/*    */     //   #29	-> 148
/*    */     //   #28	-> 156
/*    */     //   #32	-> 162
/*    */     //   #28	-> 164
/*    */     //   #35	-> 179
/*    */     //   #35	-> 190
/*    */     //   #36	-> 216
/*    */     //   #35	-> 239
/*    */     //   #38	-> 254
/*    */     //   #19	-> 255
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   122	12	12	$i$a$-count-CloudClient$1	I
/*    */     //   119	15	11	it	C
/*    */     //   115	25	10	element$iv	C
/*    */     //   86	62	7	$i$f$count	I
/*    */     //   89	59	8	count$iv	I
/*    */     //   83	65	6	$this$count$iv	Ljava/lang/CharSequence;
/*    */     //   162	2	7	$i$a$-require-CloudClient$2	I
/*    */     //   216	23	7	$i$a$-require-CloudClient$3	I
/*    */     //   61	193	5	serverHost	Ljava/lang/String;
/*    */     //   0	256	0	this	Lai/grazie/client/common/cloud/CloudClient;
/*    */     //   0	256	1	serverUrl	Ljava/lang/String;
/*    */     //   0	256	2	authType	Lai/grazie/model/cloud/AuthType;
/*    */     //   0	256	3	authVersion	Lai/grazie/model/cloud/AuthVersion;
/* 21 */     //   0	256	4	supportedAuthVersions	[Lai/grazie/model/cloud/AuthVersion; } @Nullable public AuthType getAuthType() { return this.authType; }
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
/*    */   @NotNull
/*    */   public final String url(@NotNull API api) {
/* 40 */     Intrinsics.checkNotNullParameter(api, "api"); AuthVersion authVersion1 = this.authVersion, authVersion2 = authVersion1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     AuthType authType = getAuthType(); String str = this.serverUrl; API aPI = api; int $i$a$-takeIf-CloudClient$url$1 = 0;
/*    */     boolean bool = (getAuthType() != null) ? true : false;
/*    */     if ((bool ? (AuthType)authVersion1 : null) == null)
/*    */       bool ? (AuthType)authVersion1 : null; 
/*    */     return str.url((String)authType, bool ? (AuthType)authVersion1 : null, AuthVersion.None);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\cloud\CloudClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */