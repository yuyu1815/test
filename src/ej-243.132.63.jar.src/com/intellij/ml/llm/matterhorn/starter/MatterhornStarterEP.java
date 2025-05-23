/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornStarter;
/*     */ import com.intellij.openapi.util.KeyedExtensionCollector;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\016\n\000\n\002\020 \n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\b\032\b\022\004\022\0020\0060\t2\006\020\n\032\0020\007R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStarterEP;", "", "<init>", "()V", "EP", "Lcom/intellij/openapi/util/KeyedExtensionCollector;", "Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;", "", "forMode", "", "mode", "matterhorn"})
/*     */ public final class MatterhornStarterEP
/*     */ {
/*     */   @NotNull
/* 139 */   public static final MatterhornStarterEP INSTANCE = new MatterhornStarterEP(); @NotNull private static final KeyedExtensionCollector<MatterhornStarter, String> EP = new KeyedExtensionCollector("com.intellij.ml.llm.matterhorn.matterhornStarter");
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
/*     */   @NotNull
/*     */   public final List<MatterhornStarter> forMode(@NotNull String mode) {
/* 163 */     Intrinsics.checkNotNullParameter(mode, "mode"); Intrinsics.checkNotNullExpressionValue(EP.forKey(mode), "forKey(...)"); return EP.forKey(mode);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\MatterhornStarterEP.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */