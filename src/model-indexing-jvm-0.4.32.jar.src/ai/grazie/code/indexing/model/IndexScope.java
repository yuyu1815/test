/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\016\b\001\030\000 \0232\b\022\004\022\0020\0000\001:\001\023B#\b\002\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006¢\006\002\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\tj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022¨\006\024"}, d2 = {"Lai/grazie/code/indexing/model/IndexScope;", "", "value", "", "description", "privacyFriendly", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getPrivacyFriendly", "()Z", "getValue", "FILENAMES", "SYMBOL_NAMES", "CODE_BLOCKS", "RAPTOR_INJECTED", "RAPTOR_CLASSIC", "RAPTOR_DOUBLE_PASS", "Companion", "model-indexing"})
/*    */ public enum IndexScope
/*    */ {
/* 28 */   FILENAMES("filenames", null, false, 6, null),
/* 29 */   SYMBOL_NAMES("symbol_names", null, false, 6, null),
/* 30 */   CODE_BLOCKS("code_blocks", null, false, 6, null),
/* 31 */   RAPTOR_INJECTED("raptor_injected", "Each chunk is injected with some metadata of context based on raptor", false),
/* 32 */   RAPTOR_CLASSIC("raptor", "Each chunk turned into summarization recursively that is used for build embeddings, but search happens on the files level", false),
/* 33 */   RAPTOR_DOUBLE_PASS("raptor_double_pass", "Go from bottom up and then back, injecting each summarization prompt with the information from level above", false); static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String value;
/*    */   @NotNull
/*    */   private final String description;
/*    */   private final boolean privacyFriendly;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   IndexScope(String value, String description, boolean privacyFriendly) {
/*    */     this.value = value;
/*    */     this.description = description;
/*    */     this.privacyFriendly = privacyFriendly;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.code.indexing.model.IndexScope", (Enum[])IndexScope.values());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/IndexScope$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/IndexScope;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<IndexScope> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getValue() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   public final boolean getPrivacyFriendly() {
/*    */     return this.privacyFriendly;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */