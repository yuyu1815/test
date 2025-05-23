/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.JbaUserLoginResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*     */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupportKt;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\bf\030\000 \0222\0020\001:\001\022J$\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\fH¦@¢\006\002\020\rJ\024\020\016\032\b\022\004\022\0020\0200\017H¦@¢\006\002\020\021R\032\020\002\032\n\022\006\022\004\030\0010\0040\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository;", "", "authDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "getAuthDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "loginToJba", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "mode", "Lcom/intellij/ui/JBAccountInfoService$LoginMode;", "authProviderId", "", "(Lcom/intellij/ui/JBAccountInfoService$LoginMode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOAuthProviders", "", "Lcom/intellij/ui/JBAccountInfoService$JbaOAuthProvider;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data.repos"})
/*     */ public interface JunieJbaUserRepository {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @NotNull
/*     */   Flow<JbaAuthData> getAuthDataFlow();
/*     */   
/*     */   @Nullable
/*     */   Object loginToJba(@NotNull JBAccountInfoService.LoginMode paramLoginMode, @Nullable String paramString, @NotNull Continuation<? super JbaUserLoginResult> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getOAuthProviders(@NotNull Continuation<? super List<JBAccountInfoService.JbaOAuthProvider>> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*     */   @SourceDebugExtension({"SMAP\nJunieJbaUserRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,117:1\n35#2:118\n*S KotlinDebug\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepository$Companion\n*L\n40#1:118\n*E\n"})
/*     */   public static final class Companion
/*     */     implements AiaServiceSupport<JunieJbaUserRepository> {
/*     */     private Companion() {
/*  40 */       AiaServiceSupport.Companion this_$iv = AiaServiceSupport.Companion; int $i$f$invoke = 0; this.$$delegate_0 = 
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
/* 118 */         AiaServiceSupportKt.createForServiceInterface(this_$iv, Reflection.getOrCreateKotlinClass(JunieJbaUserRepository.class));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public JunieJbaUserRepository syncInstance() {
/*     */       return (JunieJbaUserRepository)this.$$delegate_0.syncInstance();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object instance(@NotNull Continuation $completion) {
/*     */       return this.$$delegate_0.instance($completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Flow<JunieJbaUserRepository> instanceFlow() {
/*     */       return this.$$delegate_0.instanceFlow();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KClass<? extends JunieJbaUserRepository> getKeyClass() {
/*     */       return this.$$delegate_0.getKeyClass();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */