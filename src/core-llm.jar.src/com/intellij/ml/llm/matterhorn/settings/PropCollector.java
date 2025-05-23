/*    */ package com.intellij.ml.llm.matterhorn.settings;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020 \n\002\b\003\b\026\030\0002\0020\001B\007¢\006\004\b\002\020\003J\"\020\007\032\0020\0062\006\020\b\032\0020\t2\006\020\n\032\0020\t2\n\b\002\020\013\032\004\030\0010\tR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\027\020\f\032\b\022\004\022\0020\0060\r8F¢\006\006\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/PropCollector;", "", "<init>", "()V", "collectedProps", "", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "prop", "name", "", "envName", "default", "props", "", "getProps", "()Ljava/util/List;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornProperties.kt\ncom/intellij/ml/llm/matterhorn/settings/PropCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/*    */ public class PropCollector
/*    */ {
/*    */   @NotNull
/* 17 */   private final List<MatterhornProperty> collectedProps = new ArrayList<>();
/*    */   @NotNull
/*    */   public final MatterhornProperty prop(@NotNull String name, @NotNull String envName, @Nullable String default) {
/* 20 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(envName, "envName"); MatterhornProperty matterhornProperty1 = new MatterhornProperty(name, envName, default), it = matterhornProperty1;
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
/* 69 */     int $i$a$-also-PropCollector$prop$1 = 0;
/*    */     this.collectedProps.add(it);
/*    */     return matterhornProperty1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<MatterhornProperty> getProps() {
/*    */     return this.collectedProps;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\PropCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */