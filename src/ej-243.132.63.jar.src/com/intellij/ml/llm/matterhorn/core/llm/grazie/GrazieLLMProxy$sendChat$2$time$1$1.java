package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import com.intellij.ml.llm.matterhorn.llm.LlmProvider;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

@DebugMetadata(f = "GrazieLLMProxy.kt", l = {75, 79, 81}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"chat", "modelParameters", "modelParameters", "modelParameters"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy$sendChat$2$time$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;"})
final class GrazieLLMProxy$sendChat$2$time$1$1 extends SuspendLambda implements Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object> {
  int label;
  
  GrazieLLMProxy$sendChat$2$time$1$1(Continuation $completion) {
    super(4, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 359, 0 -> 40, 1 -> 100, 2 -> 229, 3 -> 287
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
    //   51: astore_2
    //   52: aload_0
    //   53: getfield L$1 : Ljava/lang/Object;
    //   56: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   59: astore_3
    //   60: aload_0
    //   61: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
    //   64: invokestatic access$getAuth$p : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;)Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;
    //   67: aload_0
    //   68: checkcast kotlin/coroutines/Continuation
    //   71: aload_0
    //   72: aload_2
    //   73: putfield L$0 : Ljava/lang/Object;
    //   76: aload_0
    //   77: aload_3
    //   78: putfield L$1 : Ljava/lang/Object;
    //   81: aload_0
    //   82: iconst_1
    //   83: putfield label : I
    //   86: invokeinterface getClient : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   91: dup
    //   92: aload #7
    //   94: if_acmpne -> 121
    //   97: aload #7
    //   99: areturn
    //   100: aload_0
    //   101: getfield L$1 : Ljava/lang/Object;
    //   104: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   107: astore_3
    //   108: aload_0
    //   109: getfield L$0 : Ljava/lang/Object;
    //   112: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
    //   115: astore_2
    //   116: aload_1
    //   117: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   120: aload_1
    //   121: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
    //   124: dup
    //   125: ifnonnull -> 139
    //   128: pop
    //   129: new java/lang/RuntimeException
    //   132: dup
    //   133: ldc 'Not authorized'
    //   135: invokespecial <init> : (Ljava/lang/String;)V
    //   138: athrow
    //   139: astore #4
    //   141: aload_3
    //   142: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
    //   145: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
    //   148: getstatic com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2$time$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
    //   151: swap
    //   152: invokevirtual ordinal : ()I
    //   155: iaload
    //   156: tableswitch default -> 306, 1 -> 180, 2 -> 248
    //   180: aload_2
    //   181: aconst_null
    //   182: iconst_1
    //   183: aconst_null
    //   184: invokestatic checkChatForAnthropic$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   187: astore #6
    //   189: aload_0
    //   190: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
    //   193: aload #4
    //   195: aload #6
    //   197: aload_3
    //   198: aload_0
    //   199: checkcast kotlin/coroutines/Continuation
    //   202: aload_0
    //   203: aload_3
    //   204: putfield L$0 : Ljava/lang/Object;
    //   207: aload_0
    //   208: aconst_null
    //   209: putfield L$1 : Ljava/lang/Object;
    //   212: aload_0
    //   213: iconst_2
    //   214: putfield label : I
    //   217: invokestatic access$getAnthropicContentChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   220: dup
    //   221: aload #7
    //   223: if_acmpne -> 242
    //   226: aload #7
    //   228: areturn
    //   229: aload_0
    //   230: getfield L$0 : Ljava/lang/Object;
    //   233: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   236: astore_3
    //   237: aload_1
    //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   241: aload_1
    //   242: checkcast java/util/Map
    //   245: goto -> 326
    //   248: aload_0
    //   249: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
    //   252: aload #4
    //   254: aload_2
    //   255: aload_3
    //   256: aload_0
    //   257: checkcast kotlin/coroutines/Continuation
    //   260: aload_0
    //   261: aload_3
    //   262: putfield L$0 : Ljava/lang/Object;
    //   265: aload_0
    //   266: aconst_null
    //   267: putfield L$1 : Ljava/lang/Object;
    //   270: aload_0
    //   271: iconst_3
    //   272: putfield label : I
    //   275: invokestatic access$getOpenAIContentChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   278: dup
    //   279: aload #7
    //   281: if_acmpne -> 300
    //   284: aload #7
    //   286: areturn
    //   287: aload_0
    //   288: getfield L$0 : Ljava/lang/Object;
    //   291: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
    //   294: astore_3
    //   295: aload_1
    //   296: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   299: aload_1
    //   300: checkcast java/util/Map
    //   303: goto -> 326
    //   306: new java/lang/RuntimeException
    //   309: dup
    //   310: aload_3
    //   311: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
    //   314: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
    //   317: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Ljava/lang/String;
    //   322: invokespecial <init> : (Ljava/lang/String;)V
    //   325: athrow
    //   326: astore #5
    //   328: new com/intellij/ml/llm/matterhorn/llm/AIAnswer
    //   331: dup
    //   332: aload_3
    //   333: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
    //   336: aload_0
    //   337: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
    //   340: aload #5
    //   342: invokestatic access$toAnswerChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Ljava/util/Map;)Ljava/util/List;
    //   345: lconst_0
    //   346: lconst_0
    //   347: lconst_0
    //   348: lconst_0
    //   349: lconst_0
    //   350: iconst_0
    //   351: sipush #252
    //   354: aconst_null
    //   355: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   358: areturn
    //   359: new java/lang/IllegalStateException
    //   362: dup
    //   363: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   365: invokespecial <init> : (Ljava/lang/String;)V
    //   368: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #74	-> 3
    //   #75	-> 60
    //   #74	-> 97
    //   #75	-> 121
    //   #76	-> 141
    //   #78	-> 180
    //   #79	-> 189
    //   #74	-> 226
    //   #79	-> 242
    //   #81	-> 248
    //   #82	-> 254
    //   #83	-> 255
    //   #81	-> 260
    //   #74	-> 284
    //   #81	-> 300
    //   #85	-> 306
    //   #76	-> 326
    //   #89	-> 328
    //   #74	-> 359
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   52	48	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   116	12	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   139	50	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   248	7	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   60	40	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   108	121	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   237	50	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   295	31	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   326	33	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   141	79	4	authClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
    //   248	6	4	authClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
    //   328	31	5	result	Ljava/util/Map;
    //   189	31	6	safeChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   0	369	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2$time$1$1;
    //   44	315	1	$result	Ljava/lang/Object;
  }
  
  public final Object invoke(MatterhornChat p1, ModelParameters p2, MatterhornPropertyProvider p3, Continuation<? super GrazieLLMProxy$sendChat$2$time$1$1> p4) {
    GrazieLLMProxy$sendChat$2$time$1$1 grazieLLMProxy$sendChat$2$time$1$1 = new GrazieLLMProxy$sendChat$2$time$1$1(p4);
    grazieLLMProxy$sendChat$2$time$1$1.L$0 = p1;
    grazieLLMProxy$sendChat$2$time$1$1.L$1 = p2;
    return grazieLLMProxy$sendChat$2$time$1$1.invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$sendChat$2$time$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */