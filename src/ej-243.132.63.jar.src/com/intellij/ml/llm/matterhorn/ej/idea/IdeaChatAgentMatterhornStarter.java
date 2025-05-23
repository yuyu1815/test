/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\000 \0062\0020\001:\001\006B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\024¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaChatAgentMatterhornStarter;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaAgentMatterhornStarterBase;", "<init>", "()V", "getLogger", "Lcom/intellij/openapi/diagnostic/Logger;", "Companion", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nIdeaChatAgentMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdeaChatAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaChatAgentMatterhornStarter\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,15:1\n14#2:16\n*S KotlinDebug\n*F\n+ 1 IdeaChatAgentMatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaChatAgentMatterhornStarter\n*L\n10#1:16\n*E\n"})
/*    */ public final class IdeaChatAgentMatterhornStarter extends IdeaAgentMatterhornStarterBase {
/*  8 */   public IdeaChatAgentMatterhornStarter() { super(AgentArtifactTypes.INSTANCE.getChatArtifactType()); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaChatAgentMatterhornStarter$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-idea"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 10 */     public final Logger getLogger() { return IdeaChatAgentMatterhornStarter.logger; } } @NotNull public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(IdeaChatAgentMatterhornStarter.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(IdeaChatAgentMatterhornStarter.class);
/*    */   
/*    */   @NotNull
/*    */   protected Logger getLogger() {
/*    */     return logger;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaChatAgentMatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */