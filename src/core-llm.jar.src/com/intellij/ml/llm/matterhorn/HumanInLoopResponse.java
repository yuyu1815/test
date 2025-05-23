/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "", "<init>", "()V", "Agree", "Disagree", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree;", "core"})
/*     */ public abstract class HumanInLoopResponse
/*     */ {
/*     */   private HumanInLoopResponse() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "<init>", "()V", "core"})
/*     */   public static final class Agree
/*     */     extends HumanInLoopResponse
/*     */   {
/*     */     @NotNull
/*     */     public static final Agree INSTANCE = new Agree();
/*     */     
/*     */     private Agree() {
/* 114 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "<init>", "()V", "core"})
/* 115 */   public static final class Disagree extends HumanInLoopResponse { private Disagree() { super(null); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public static final Disagree INSTANCE = new Disagree(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */