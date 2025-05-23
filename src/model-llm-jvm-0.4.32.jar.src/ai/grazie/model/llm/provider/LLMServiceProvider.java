/*    */ package ai.grazie.model.llm.provider;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.v5.LLMChatService;
/*    */ import ai.grazie.model.llm.completion.LLMCompletionService;
/*    */ import ai.grazie.model.llm.profile.LLMProfile;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\0012\0020\0022\0020\003J\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\026J\022\020\r\032\004\030\0010\0162\006\020\013\032\0020\fH\026J\020\020\017\032\0020\0202\006\020\013\032\0020\006H\026J\022\020\013\032\004\030\0010\0062\006\020\021\032\0020\fH\026J\020\020\022\032\0020\0232\006\020\013\032\0020\006H&R\030\020\004\032\b\022\004\022\0020\0060\005X¦\004¢\006\006\032\004\b\007\020\bø\001\000\002\006\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Lai/grazie/model/llm/provider/LLMServiceProvider;", "Lai/grazie/model/llm/provider/LLMProfileProvider;", "Lai/grazie/model/llm/provider/LLMChatServiceProvider;", "Lai/grazie/model/llm/provider/LLMCompletionServiceProvider;", "profiles", "", "Lai/grazie/model/llm/profile/LLMProfile;", "getProfiles", "()Ljava/util/List;", "completions", "Lai/grazie/model/llm/completion/LLMCompletionService;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChats", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "isSupportedProfile", "", "id", "service", "Lai/grazie/model/llm/LLMService;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMServiceProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMServiceProvider.kt\nai/grazie/model/llm/provider/LLMServiceProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/*    */ public interface LLMServiceProvider extends LLMProfileProvider, LLMChatServiceProvider, LLMCompletionServiceProvider {
/*    */   @NotNull
/*    */   List<LLMProfile> getProfiles();
/*    */   
/*    */   @Nullable
/* 19 */   default LLMChatService getChats(@NotNull LLMProfileID profile) { Intrinsics.checkNotNullParameter(profile, "profile"); if (profile(profile) == null) { profile(profile); return null; }  return (LLMChatService)profile(profile).service(profile(profile)); }
/*    */   @NotNull
/*    */   LLMService service(@NotNull LLMProfile paramLLMProfile); @Nullable
/*    */   default LLMProfile profile(@NotNull LLMProfileID id) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'id'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokeinterface getProfiles : ()Ljava/util/List;
/*    */     //   12: checkcast java/lang/Iterable
/*    */     //   15: astore_2
/*    */     //   16: aload_2
/*    */     //   17: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   22: astore_3
/*    */     //   23: aload_3
/*    */     //   24: invokeinterface hasNext : ()Z
/*    */     //   29: ifeq -> 67
/*    */     //   32: aload_3
/*    */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   38: astore #4
/*    */     //   40: aload #4
/*    */     //   42: checkcast ai/grazie/model/llm/profile/LLMProfile
/*    */     //   45: astore #5
/*    */     //   47: iconst_0
/*    */     //   48: istore #6
/*    */     //   50: aload #5
/*    */     //   52: invokevirtual getId : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   55: aload_1
/*    */     //   56: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   59: ifeq -> 23
/*    */     //   62: aload #4
/*    */     //   64: goto -> 68
/*    */     //   67: aconst_null
/*    */     //   68: checkcast ai/grazie/model/llm/profile/LLMProfile
/*    */     //   71: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #31	-> 47
/*    */     //   #15	-> 50
/*    */     //   #15	-> 59
/*    */     //   #15	-> 71
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	9	6	$i$a$-find-LLMServiceProvider$profile$1	I
/*    */     //   47	12	5	it	Lai/grazie/model/llm/profile/LLMProfile;
/*    */     //   0	72	0	this	Lai/grazie/model/llm/provider/LLMServiceProvider;
/*    */     //   0	72	1	id	Lai/grazie/model/llm/profile/LLMProfileID; } @Nullable
/* 23 */   default LLMCompletionService completions(@NotNull LLMProfileID profile) { Intrinsics.checkNotNullParameter(profile, "profile"); if (profile(profile) == null) { profile(profile); return null; }  return (LLMCompletionService)profile(profile).service(profile(profile)); }
/*    */ 
/*    */   
/*    */   default boolean isSupportedProfile(@NotNull LLMProfile profile) {
/* 27 */     Intrinsics.checkNotNullParameter(profile, "profile"); return getProfiles().contains(profile);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\provider\LLMServiceProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */