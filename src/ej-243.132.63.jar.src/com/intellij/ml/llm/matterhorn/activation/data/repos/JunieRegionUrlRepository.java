/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\bf\030\000 \b2\0020\001:\001\bJ\030\020\002\032\0020\0032\006\020\004\032\0020\005H¦@¢\006\004\b\006\020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;", "", "mapRegionUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl;", "rawUrl", "", "mapRegionUrl-dorYjGE", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data.repos"})
/*    */ public interface JunieRegionUrlRepository {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Nullable
/*    */   Object mapRegionUrl-dorYjGE(@NotNull String paramString, @NotNull Continuation<? super RegionUrl> paramContinuation) throws IOException;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*    */   @SourceDebugExtension({"SMAP\nJunieRegionUrlRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieRegionUrlRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,24:1\n35#2:25\n*S KotlinDebug\n*F\n+ 1 JunieRegionUrlRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieRegionUrlRepository$Companion\n*L\n14#1:25\n*E\n"})
/*    */   public static final class Companion implements AiaServiceSupport<JunieRegionUrlRepository> {
/*    */     private Companion() {
/* 14 */       AiaServiceSupport.Companion this_$iv = AiaServiceSupport.Companion; int $i$f$invoke = 0; this.$$delegate_0 = 
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
/* 25 */         AiaServiceSupportKt.createForServiceInterface(this_$iv, Reflection.getOrCreateKotlinClass(JunieRegionUrlRepository.class));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JunieRegionUrlRepository syncInstance() {
/*    */       return (JunieRegionUrlRepository)this.$$delegate_0.syncInstance();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object instance(@NotNull Continuation $completion) {
/*    */       return this.$$delegate_0.instance($completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Flow<JunieRegionUrlRepository> instanceFlow() {
/*    */       return this.$$delegate_0.instanceFlow();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KClass<? extends JunieRegionUrlRepository> getKeyClass() {
/*    */       return this.$$delegate_0.getKeyClass();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieRegionUrlRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */